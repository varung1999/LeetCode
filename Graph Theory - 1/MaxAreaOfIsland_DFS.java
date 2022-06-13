class Solution {
    int sum,maxSum;
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        
        for(int i =0;i<grid.length;i++)
        {
            for(int j =0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                {
                    sum = 0;
                    dfs(grid,i,j);
                }
            }
        }
        
        return maxSum;
    }
    
    private void dfs(int[][] grid, int r, int c)
    {
        //base
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]!=1)
        {
            return;
        }
        
        //logic
        sum+=1;
        grid[r][c] = 0;
        maxSum=Math.max(sum,maxSum);
        
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
}
