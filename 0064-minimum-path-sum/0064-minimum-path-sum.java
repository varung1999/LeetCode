class Solution {
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        int[] dp = new int[grid[0].length];
        
        for(int i = grid.length-1;i>=0;i--)
        {
            for(int j = grid[0].length-1;j>=0;j--)
            {
                //last row but not last col
                if(i==grid.length-1 && j!=grid[0].length-1)
                {
                    dp[j] = grid[i][j] + dp[j+1];
                }
                
                //last col but not last row
               else if(j==grid[0].length-1 && i!=grid.length-1)
                {
                    dp[j] = grid[i][j] + dp[j];
                }
                
                //not last row && not last col
                
                else if(i!=grid.length-1 && j!=grid[0].length-1)
                {
                    dp[j] = grid[i][j] + Math.min(dp[j],dp[j+1]);
                }
                
                else{
                    dp[j] = grid[i][j];
                }
            }
        }
        return dp[0];
    }
}