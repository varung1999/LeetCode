class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0;i<nums.length;i++)
        {
            sum+=nums[i];
            
            int r = sum%k;
            if(!map.containsKey(r))
            {
                map.put(r,i);
            }
            else if(i - map.get(r) > 1){
                return true;
            }
        }
        
        return false;
    }
}