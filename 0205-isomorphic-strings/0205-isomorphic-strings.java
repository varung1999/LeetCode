class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(!map.containsKey(sChar) && set.contains(tChar)) return false;
            if(map.containsKey(sChar) && map.get(sChar)!=tChar) {
                return false;
            }
            else{
                map.put(sChar,tChar);
                set.add(tChar);
            }
        }
        return true;
    }
}