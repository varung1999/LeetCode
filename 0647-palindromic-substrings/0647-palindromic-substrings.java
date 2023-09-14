class Solution {
    public int countSubstrings(String s) {
        if(s == null || s.length() == 0) return 0;
        
        int count = 0;
        
        for(int i = 0;i<s.length();i++)
        {
            count++;
            for(int j = 0;j<i;j++)
            {
                if(isPalindrome(s.substring(j,i+1))) count++;
            }
        }
        
        return count;
    }
    
    private boolean isPalindrome(String s)
    {
        int i = 0, j = s.length() -1;
        
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
}