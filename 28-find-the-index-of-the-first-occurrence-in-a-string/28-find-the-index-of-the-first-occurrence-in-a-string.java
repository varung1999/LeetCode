class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0) return 0;
        int m = haystack.length();
        int n = needle.length();
        
        int i = 0;
        int j = 0;
        int[] lps = lps(needle);
        
        while(i<m)
        {
            if(haystack.charAt(i) == needle.charAt(j))
            {
                i++;
                j++;
                if(j == n) return i -n;
            }
            else if(haystack.charAt(i)!=needle.charAt(j) && j>0)
            {
                j = lps[j-1];
            }
            else if(haystack.charAt(i)!=needle.charAt(j) && j == 0)
            {
                i++;
            }
        }
        
        return -1;
    }
    
    private int[] lps(String s)
    {
        int[] lps = new int[s.length()];
        int j = 0, i = 1;
        while(i<s.length())
        {
            if(s.charAt(i)==s.charAt(j))
            {
                j++;
                lps[i]=j;
                i++;
            }
            else if(s.charAt(j)!=s.charAt(i) && j>0)
            {
                j = lps[j-1];
            }
            else if(s.charAt(j)!=s.charAt(i) && j==0)
            {
                lps[i]=0;
                i++;
            }
        }
        
        return lps;
    }
}