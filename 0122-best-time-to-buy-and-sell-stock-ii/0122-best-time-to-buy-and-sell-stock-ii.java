class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        
        int n = prices.length;
        int[] dp = new int[n+1];
        
        for(int i = 1;i<=n;i++)
        {
            if(i==1) dp[i] = 0;
            else dp[i] = Math.max(dp[i-1], dp[i-1] + prices[i-1] - prices[i-2]);
        }
        
        return dp[n] == 0?0:dp[n];
    }
}