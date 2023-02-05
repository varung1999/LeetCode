class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p == null || p.length() == 0 || s == null || s.length() == 0 || p.length()>s.length()) return new ArrayList<>();
        
        List<Integer> result = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<p.length();i++)
        {
            char curr = p.charAt(i);
            map.put(curr, map.getOrDefault(curr,0)+1);
        }
        
        int match = 0;
        
        for(int i =0;i<s.length();i++)
        {
            char sChar = s.charAt(i);
            if(map.containsKey(sChar))
            {
                int count = map.get(sChar);
                count--;
                if(count == 0) match++;
                map.put(sChar,count);
            }
            
            if(i>=p.length())
            {
                char out = s.charAt(i-p.length());
                if(map.containsKey(out))
                {
                    int count = map.get(out);
                    count++;
                    if(count == 1)  match--;
                    map.put(out,count);
                }
            }
            
            if(match == map.size())
            {
                result.add(i-p.length()+1);
            }
        }
        
        return result;
    }
}