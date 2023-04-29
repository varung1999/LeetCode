class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max = Integer.MIN_VALUE;
        int n = values.length;
        int[] dp = new int[n];
        
        dp[0] = values[0];
        
        for(int i = 1;i<values.length;i++)
        {
            max = Math.max(max,dp[i-1] + values[i] - i);
            dp[i] = Math.max(dp[i-1],values[i]+i);
        }
        
        return max;
    }
}