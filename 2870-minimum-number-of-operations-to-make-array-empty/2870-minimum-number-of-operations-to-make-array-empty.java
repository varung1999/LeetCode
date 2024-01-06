class Solution {
    public int minOperations(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        
        int count = 0;
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int val = entry.getValue();
            if(val == 1) return -1;
            count+=Math.ceil((double)val/3);
        }
        
        return count;
    }
}