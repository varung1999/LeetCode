class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        
        int  n = prices.length;
        int[] dp = new int[n];
        
        for(int i = 0;i<n;i++)
        {
            if(i==0) dp[0] = 0;
            else if(i == 1) dp[1] = Math.max(prices[1] - prices[0],0);
            else{
                dp[i] = dp[i-1];
                
                for(int j = 0;j<i;j++)
                {
                    int prev = j>=2 ? dp[j-2]:0;
                    dp[i] = Math.max(dp[i], prev + prices[i] - prices[j]);
                }
            }
        }
        
        return dp[n-1];
    }
}