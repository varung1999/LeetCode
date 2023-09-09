class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return "";
        
        String res = "";
        int resLen = 0;
        
        for(int i = 0;i<s.length();i++)
        {
            //odd length palindromes
            int left = i,right = i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                if(right - left + 1>resLen)
                {
                    resLen = right - left + 1;
                    res = s.substring(left,right+1);
                }
                left--;
                right++;
            }
            
            //even length palindromes
            left = i;
            right = i+1;
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right))
            {
                if(right - left + 1 > resLen)
                {
                    resLen = right - left + 1;
                    res = s.substring(left,right+1);
                }
                left--;
                right++;
            }
        }
        
        return res;
    }
}