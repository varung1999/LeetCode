class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        int rSum = 0;
        int total = 0;
        for(int i =0;i<nums.length;i++)
        {
            rSum+=nums[i];
            
            int diff = rSum - k;
            
            if(map.containsKey(diff))
            {
                total+=map.get(diff);
            }
            map.put(rSum,map.getOrDefault(rSum,0)+1);
        }
        return total;
    }
}