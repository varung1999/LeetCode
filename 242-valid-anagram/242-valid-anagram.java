class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        char[] sChar = s.toCharArray();
        char[] pChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(pChar);
        
        for(int i =0;i<sChar.length;i++)
        {
            if(sChar[i]!=pChar[i]) return false;
        }
        return true;
    }
}