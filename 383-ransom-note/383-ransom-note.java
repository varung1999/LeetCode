class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine == null || magazine.length() == 0) return false;
        
        int[] magArr = new int[26];
        for(int i =0;i<magazine.length();i++)
        {
            char c = magazine.charAt(i);
            magArr[c-'a']++;
        }
        
        for(int i =0;i<ransomNote.length();i++)
        {
            char c = ransomNote.charAt(i);
            magArr[c-'a']--;
            
            if(magArr[c-'a']<0) return false;
        }
        
        return true;
    }
}