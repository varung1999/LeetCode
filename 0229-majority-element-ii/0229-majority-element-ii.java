class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int key:map.keySet())
        {
            if(map.get(key)>n/3) result.add(key);
        }
        
        return result;
    }
}