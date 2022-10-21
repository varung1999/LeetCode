class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length == 0) return false;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i])-i)<=k)
            {
                return true;
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        
        return false;
    }
}