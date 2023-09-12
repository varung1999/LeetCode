class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1 == null || text2 == null) return 0;
        
        if(text2.length()>text1.length()) return longestCommonSubsequence(text2,text1);
        
        int[] dp = new int[text1.length()+1];
        
       for(int i = 0;i<text2.length();i++)
       {
           int prev = 0;
           for(int j = 1;j<dp.length;j++)
           {
               int temp = dp[j];
               if(text2.charAt(i)==text1.charAt(j-1))
               {
                   dp[j] = 1 + prev;
               }
               else{
                   dp[j] = Math.max(dp[j],dp[j-1]);
               }
               prev = temp;
           }
           
       }
        
        return dp[dp.length-1];
    }
}