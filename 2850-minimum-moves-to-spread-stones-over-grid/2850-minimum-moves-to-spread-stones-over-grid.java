class Solution {
    public int minimumMoves(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        int count = 0;
        for(int i = 0;i<grid.length;i++)
        {
            for(int j = 0;j<grid.length;j++)
            {
                if(grid[i][j] == 0) count++;
            }
        }
        
        if(count == 0) return 0;
        
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                if(grid[i][j] == 0)
                {
                    for(int ni=0;ni<3;ni++)
                    {
                        for(int nj = 0;nj<3;nj++)
                        {
                            int diff = Math.abs(ni-i) + Math.abs(nj-j);
                            
                            if(grid[ni][nj]>1)
                            {
                                grid[ni][nj]--;
                                grid[i][j]++;
                                
                                ans = Math.min(ans, diff + minimumMoves(grid));
                                grid[ni][nj]++;
                                grid[i][j]--;
                            }
                        }
                    }
                }
            }
        }
        
        return ans;
    }
}