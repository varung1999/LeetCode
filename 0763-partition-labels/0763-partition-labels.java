class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            map.put(c,i);
        }
        
        int j = 0, anchor = 0;
        for(int i = 0;i<s.length();i++)
        {
            j = Math.max(j, map.get(s.charAt(i)));
            if(i==j){
                result.add(i-anchor+1);
                anchor = i + 1;
            }
        }
        return result;
    }
}