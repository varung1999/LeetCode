class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0) return result;
        
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(int i =0;i<strs.length;i++)
        {
            String inp = strs[i];
            char[] temp = inp.toCharArray();
            Arrays.sort(temp);
            String sorted = String.valueOf(temp);
            
            if(!map.containsKey(sorted))
            {
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(inp);
        }
        
       for(Map.Entry<String,List<String>> it : map.entrySet())
       {
           result.add(it.getValue());
       }
        return result;
    }
}