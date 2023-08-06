class Solution {
    public int majorityElement(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int n = nums.length;
        
        for(int key:map.keySet())
        {
            if(map.get(key)>n/2) return key;
        }
        
        return -1;
    }
}