class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t == null || s.length()!=t.length()) return false;
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        
        for(char c:t.toCharArray()){
            if(!map.containsKey(c)) return false;
            else{
                int val = map.get(c);
                val--;
                if(val==0) map.remove(c);
                else map.put(c,val);
            }
        }
        
        return true;
    }
}