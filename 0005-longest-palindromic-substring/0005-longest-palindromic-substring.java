class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return "";
        
        String result = s.charAt(0)+"";
        int len = 1;
        for(int i = 0;i<s.length();i++)
        {
            for(int j = 0;j<i;j++)
            {
                String substring = s.substring(j,i+1);
                if(isPalindrome(substring) && substring.length()>len) {
                    len = substring.length();
                    result = substring;
                    
                }
            }
        }
        
        return result;
    }
    
    private boolean isPalindrome(String s)
    {
        int i = 0, j = s.length()-1;
        
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
}