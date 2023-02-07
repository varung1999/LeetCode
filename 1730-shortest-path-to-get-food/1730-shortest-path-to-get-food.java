class Solution {
    public int getFood(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j] == '#')
                {
                    q.add(new int[]{i,j});
                }
            }
        }
        
        //if(q.size() == 0) return 0;
        
        int level = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i = 0;i<size;i++)
            {
                int[] curr = q.poll();
                if(grid[curr[0]][curr[1]]=='*') return level;
                for(int[] dir: dirs)
                {
                    int nr = dir[0] + curr[0];
                    int nc = dir[1] + curr[1];
                    
                    if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]=='O')
                    {
                        grid[nr][nc] = 'X';
                        q.add(new int[]{nr,nc});
                    }
                    else if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]=='*')
                    {
                        return level+1;
                    }
                }
            }
            level++;
        }
        return -1;
    }
}