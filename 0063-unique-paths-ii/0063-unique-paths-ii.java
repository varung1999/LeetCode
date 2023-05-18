class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0) return 0;
        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        if(obstacleGrid[m-1][n-1] == 1) return 0;
        
        int[][] dp = new int[m+1][n+1];
        
        for(int i = m - 1;i>=0;i--)
        {
            for(int j = n - 1;j>=0;j--)
            {
                if(obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else if(i== m - 1 && j == n - 1) dp[i][j] = 1;
                else dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }
        
        return dp[0][0];
        
    }
}