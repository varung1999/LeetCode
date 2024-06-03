class Solution {
    public int appendCharacters(String s, String t) {
        if(s == null || s.length() == 0) return t.length();
        
        int sLength = s.length(), tLength = t.length();
        
        int sIndex = 0, tIndex = 0;
        
        while(sIndex<sLength && tIndex<tLength){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                tIndex++;
            }
            sIndex++;
        }
        
        return tLength - tIndex;
    }
}