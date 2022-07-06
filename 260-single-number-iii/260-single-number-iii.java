class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
        ArrayList<Integer> ans = new ArrayList<>();
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> it: map.entrySet())
        {
            if(it.getValue()==1)
            {
                ans.add(it.getKey());
            }
        }
        
        int[] result = new int[ans.size()];
        for(int i =0;i<ans.size();i++)
        {
            result[i]=ans.get(i);
        }
        
        return result;
    }
}