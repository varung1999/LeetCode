class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        //if(query_row == 0) return 0.0;
        
        double[][] dp = new double[query_row+1][];
        
        for(int i = 0;i<dp.length;i++)
        {
            dp[i] = new double[i+1];
        }
        
        dp[0][0] = poured;
        
        for(int i = 0;i<query_row;i++)
        {
            for(int j = 0;j<dp[i].length;j++)
            {
                double excess = (dp[i][j] - 1)/2.0;
                if(excess>0)
                {
                    dp[i+1][j+1] += excess;
                    dp[i+1][j] += excess;
                }
            }
        }
        
        return Math.min(1.0, dp[query_row][query_glass]);
        
    }
}