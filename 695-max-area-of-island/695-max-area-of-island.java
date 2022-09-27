class Solution {
    int maxArea = 0;
    int n,m;
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        n = grid.length;
        m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j = 0;j<m;j++){
                
                if(grid[i][j] == 1 && !visited[i][j])
                {
                    int area = dfs(grid,visited,i,j);
                    maxArea = Math.max(area,maxArea);
                }
            } 
        }
        
        return maxArea;
    }
    
    private int dfs(int[][] grid, boolean[][] visited, int i, int j)
    {
        //base
        if(i<0 || j<0 || i==n || j == m || visited[i][j] || grid[i][j]!=1) return 0;
        
        //logic
        visited[i][j] = true;
        int currArea = 1;
        currArea+=dfs(grid,visited,i-1,j);
        currArea+=dfs(grid,visited,i+1,j);
        currArea+=dfs(grid,visited,i,j+1);
        currArea+=dfs(grid,visited,i,j-1);
        
        return currArea;
    }
}