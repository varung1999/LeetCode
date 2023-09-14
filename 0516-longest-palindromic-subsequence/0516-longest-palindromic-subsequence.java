class Solution {
    public int longestPalindromeSubseq(String s) {
        if(s==null || s.length() == 0) return 0;
        
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        StringBuilder sb = new StringBuilder(s);
        String sRev = sb.reverse().toString();
        
        for(int i = 1;i<dp.length;i++)
        {
            for(int j = 1;j<dp.length;j++)
            {
                if(s.charAt(i-1) == sRev.charAt(j-1)) 
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        
        return dp[n][n];
    }
}