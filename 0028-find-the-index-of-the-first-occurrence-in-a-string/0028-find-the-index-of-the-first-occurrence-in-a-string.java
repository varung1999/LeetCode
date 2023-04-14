class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        
        int[] lps = lps(needle);
        
        int i = 0, j = 0;
        
        while(i<m)
        {
            if(haystack.charAt(i) == needle.charAt(j))
            {
                i++;
                j++;
                if(j == n) return i - n;
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
    
    private int[] lps(String needle)
    {
        int[] lps = new int[needle.length()];
        int i = 1;
        int j = 0;
        
        while(i<needle.length())
        {
            if(needle.charAt(i)==needle.charAt(j))
            {
                j++;
                lps[i]=j;
                i++;
            }
            else if(needle.charAt(i)!=needle.charAt(j) && j>0)
            {
                j = lps[j-1];
            }
            else if(needle.charAt(i)!=needle.charAt(j) && j==0)
            {
                lps[i]=0;
                i++;
            }
        }
        
        return lps;
    }
}