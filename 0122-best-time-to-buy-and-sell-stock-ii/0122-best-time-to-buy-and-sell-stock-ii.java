class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        
        int n = prices.length;
        int[] dp = new int[n+1];
        int max = Integer.MIN_VALUE;
        for(int i = 1;i<n;i++)
        {
            dp[i] = Math.max(dp[i-1],dp[i-1] + prices[i] - prices[i-1]);
            max = Math.max(max,dp[i]);
        }
        
        return max==Integer.MIN_VALUE?0:max;
    }
}