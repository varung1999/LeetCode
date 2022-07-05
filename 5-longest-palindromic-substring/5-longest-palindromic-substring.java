class Solution {
    int max,start,end;
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return "";
        
        for(int i =0;i<s.length();i++)
        {
            expand(s,i,i);//capture odd length
            if(i+1 < s.length() && s.charAt(i) == s.charAt(i+1))
            {
                expand(s,i,i+1);
            }
        }
        
        return s.substring(start,end+1);
    }
    
    private void expand(String s, int left, int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        left++;
        right--;
        
        if(right - left + 1 > max)
        {
            max = right - left + 1;
            start = left;
            end = right;
        }
    }
}