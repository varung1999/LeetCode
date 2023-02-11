class Solution {
    public int shortestBridge(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        Queue<int[]> q = new LinkedList<>();
        boolean flag = false;
        
        for(int i = 0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                {
                    dfs(grid,i,j,q);
                    flag = true;
                    break;
                }
            }
            
            if(flag == true) break;
        }
        
        return helper(grid,q);
    }
    
    private void dfs(int[][] grid, int i, int j, Queue<int[]> q)
    {
        //base
        if(i<0 || i==grid.length || j<0 || j==grid[0].length || grid[i][j]==-1 || grid[i][j]==0) return;
        
        //logic
        grid[i][j] = -1;
        q.add(new int[]{i,j});
        dfs(grid,i+1,j,q);
        dfs(grid,i-1,j,q);
        dfs(grid,i,j+1,q);
        dfs(grid,i,j-1,q);
    }
    
    private int helper(int[][] grid,Queue<int[]> q)
    {
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        
        int level = 0;
        
        while(!q.isEmpty())
        {
            int size = q.size();
            
            for(int i = 0;i<size;i++)
            {
                int[] curr = q.poll();
                for(int[] dir: dirs)
                {
                    int nr = dir[0] + curr[0];
                    int nc = dir[1] + curr[1];
                    
                    if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc] == 0)
                    {
                        grid[nr][nc] = -1;
                        q.add(new int[]{nr,nc});
                    }
                    else if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1)
                    {
                        return level;
                    }
                }
            }
            
            level++;
        }
        return -1;
    }
}