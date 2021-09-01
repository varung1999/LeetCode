class Solution {
    public boolean isAnagram(String s, String t) {
        char array[] = new char[26];
        
        for(char first:s.toCharArray())
        {
            array[first - 'a']++;
        }
        for(char sec:t.toCharArray())
        {
            array[sec - 'a']--;
        }
        
        for(int i =0;i<array.length;i++)
        {
            if(array[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
