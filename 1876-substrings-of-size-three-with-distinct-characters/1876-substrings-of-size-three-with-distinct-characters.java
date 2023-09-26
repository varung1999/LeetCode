class Solution {
    public int countGoodSubstrings(String s) {
        if(s == null || s.length() == 0) return 0;
        
        int count = 0;
        for(int i = 0;i<s.length()-3;i++)
        {
            char first = s.charAt(i);
            char second = s.charAt(i+1);
            char third = s.charAt(i+2);
            if(first!=second && second!=third && first!=third) {
                count++;
            }
        }
        int n = s.length();
        boolean last = false;
        if(n>=3) last = (s.charAt(n-3) !=s.charAt(n-2) && s.charAt(n-2)!=s.charAt(n-1) && s.charAt(n-3)!=s.charAt(n-1));
        return last == true? count +1: count;
    }
}