class Solution {
    public int numEnclaves(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        for(int i =0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[i].length;j++)
            {
                if((i==0 || j == 0 || i == grid.length-1 || j == grid[0].length - 1) && grid[i][j] == 1){
                    dfs(grid,i,j);
                }
            }
        }
        
        int count = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1) count++;
            }
        }
        
        return count;
    }
    
    private void dfs(int[][] grid, int i, int j)
    {
        //base
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0) return;
        //logic
        grid[i][j] = 0;
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}