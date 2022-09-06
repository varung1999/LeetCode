class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome == null || palindrome.length() == 0) return "";
        StringBuilder sb = new StringBuilder(palindrome);
        if(sb.length()<2)
        {
            return "";
        }
        
        for(int i =0;i<sb.length()/2;i++)
        {
            if(sb.charAt(i)!='a')
            {
                sb.setCharAt(i,'a');
                return sb.toString();
            }
        }
        
        sb.setCharAt(sb.length()-1,'b');
        return sb.toString();
       
    }
}