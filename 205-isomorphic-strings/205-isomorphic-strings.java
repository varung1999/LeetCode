class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        
        
        for(int i =0;i<s.length();i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(map.containsKey(sChar) && map.get(sChar)!=tChar)
            {
                return false;
            }
            
            if(!map.containsKey(sChar) && set.contains(tChar))
            {
                return false;
            }
            
            map.put(sChar,tChar);
            set.add(tChar);
        }
        return true;
    }
}