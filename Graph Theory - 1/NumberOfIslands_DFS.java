class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        int total = 0;
        for(int i = 0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j);
                    total++;
                }
            }
        }
        
        return total;
    }
    
    private void dfs(char[][] grid, int r, int c)
    {
        //base
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]!='1')
        {
            return;
        }
        
        //logic
        grid[r][c] = 0;
        
        dfs(grid,r-1,c);//up
        dfs(grid,r+1,c);//down
        dfs(grid,r,c-1);//left
        dfs(grid,r,c+1);//right
    }
}
