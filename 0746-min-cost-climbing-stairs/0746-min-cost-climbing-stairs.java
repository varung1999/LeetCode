class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost == null || cost.length == 0) return 0;
        int n = cost.length;
        int[] dp = new int[n+1];
        
        for(int i = 2;i<=n;i++)
        {
            int one = dp[i-1] + cost[i-1];
            int two = dp[i-2] + cost[i-2];
            
            dp[i] = Math.min(one,two);
        }
        
        return dp[n];
        
    }
}