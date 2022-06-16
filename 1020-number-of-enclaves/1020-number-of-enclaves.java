class Solution {
    int total,count;
    boolean isBorder;
    public int numEnclaves(int[][] grid) {
        if(grid == null || grid.length == 0)
        {
            return 0;
        }
        
        total = 0;
        isBorder = false;
        
        for(int i =0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                {
                    isBorder = true;
                    count = 0;
                    dfs(grid,i,j);
                    
                    if(isBorder)
                    {
                        total+=count;
                    }
                }
            }
        }
        
        return total;
    }
    
    private void dfs(int[][] grid, int r, int c)
    {
        //base
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]!=1)
        {
            return;
        }
        
        if(borderHelper(grid,r,c))
        {
            isBorder = false;
        }
        
        //logic
        if(grid[r][c] == 1)
        {
            grid[r][c] = 0;
                count++;
        }
        
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
    
    private boolean borderHelper(int[][] grid, int r, int c)
    {
        return r==0 || c==0 || r==grid.length-1 || c == grid[0].length - 1;
    }
}