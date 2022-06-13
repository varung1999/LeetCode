class Solution {
    
    int total = 0;
    public int closedIsland(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        for(int i =1;i<grid.length;i++)
        {
            for(int j = 1;j<grid[0].length;j++)
            {
                if(grid[i][j] == 0)
                {
                    
                    
                   if(dfs(grid,i,j))
                   {
                       total++;
                   }
                    
                    
                }
            }
        }
        
        return total;
        
    }
    
    private boolean dfs(int[][] grid, int i, int j)
    {
        //base
        if(grid[i][j]==1) return true;
        
        if(helper(i,j,grid)) return false;
        
        //logic
        
        grid[i][j]=1;
        boolean down = dfs(grid,i+1,j);
        boolean up = dfs(grid,i-1,j);
        boolean left = dfs(grid,i,j-1);
        boolean right = dfs(grid,i,j+1);
        
        
        return down && up && left && right;
    }
    
    private boolean helper(int r,int c, int grid[][])
    {
        return r==0 || c == 0 || r == grid.length - 1 || c == grid[0].length - 1;
    }
}
