class Solution {
    public String frequencySort(String s) {
        if(s == null || s.length() == 0) return "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        
        StringBuilder sb = new StringBuilder();
        for(char c: list)
        {
            int count = map.get(c);
            for(int i = 0;i<count;i++)
            {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}