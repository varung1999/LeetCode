class Solution {
    int res;
    public int mincostTickets(int[] days, int[] costs) {
        if(days == null || days.length == 0 || costs == null || costs.length == 0) return 0;
        
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: days) set.add(i);
        int[] dp = new int[365+30+1];
        
        for(int i = 365;i>=1;i--)
        {
            if(!set.contains(i))
            {
                dp[i]=dp[i+1];
                continue;
            }
            
            dp[i] = Math.min(dp[i+1] + costs[0], Math.min(dp[i+7] +costs[1],dp[i+30] + costs[2]));
        }
        return dp[1];
    }
        
}