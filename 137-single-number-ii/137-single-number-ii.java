class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> it: map.entrySet())
        {
            if(it.getValue()==1)
            {
                return it.getKey();
            }
        }
        
        return -1;
    }
}