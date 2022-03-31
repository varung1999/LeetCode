class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for(int i =0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int count = 0;
        for(Map.Entry it: map.entrySet())
        {
            count+=(int)it.getValue();
            
            if(count>nums.length-k)
            {
                return (int)it.getKey();
            }
        }
        return -1;
        
    }
}
