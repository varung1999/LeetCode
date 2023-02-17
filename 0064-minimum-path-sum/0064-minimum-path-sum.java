class Solution {
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        int[][] dp = new int[grid.length][grid[0].length];
        
        for(int i = grid.length-1;i>=0;i--)
        {
            for(int j = grid[0].length-1;j>=0;j--)
            {
                //last row but not last col
                if(i==grid.length-1 && j!=grid[0].length-1)
                {
                    dp[i][j] = dp[i][j+1] + grid[i][j];
                }
                
                //last col but not last row
               else if(j==grid[0].length-1 && i!=grid.length-1)
                {
                    dp[i][j] = grid[i][j] + dp[i+1][j];
                }
                
                //not last row && not last col
                
                else if(i!=grid.length-1 && j!=grid[0].length-1)
                {
                    dp[i][j] = grid[i][j] + Math.min(dp[i+1][j],dp[i][j+1]);
                }
                
                else{
                    dp[i][j] = grid[i][j];
                }
            }
        }
        return dp[0][0];
    }
}