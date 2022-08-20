class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        int count =0;
        
        for(int i =0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j] == '1')
                {
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    
    private void dfs(char[][] grid, int i,int j)
    {
        //base
        if(i<0 || i==grid.length || j<0 || j==grid[0].length || grid[i][j] != '1') return;
        
        //logic
        grid[i][j] = 0;
        
        dfs(grid,i-1,j);//up
        dfs(grid,i+1,j);//down
        dfs(grid,i,j-1);//left
        dfs(grid,i,j+1);//right
    }
}