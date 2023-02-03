class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        Queue<int[]> q = new LinkedList<>();
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        int fresh = 0;
        for(int i =0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1) fresh++; 
                if(grid[i][j] == 2) q.add(new int[]{i,j});
            }
        }
        
        if(fresh == 0) return 0;
        int count = 0;
        
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i =0;i<size;i++)
            {
                int[] curr = q.poll();
                
                for(int[] dir: dirs)
                {
                    int nr = dir[0] + curr[0];
                    int nc = dir[1] + curr[1];
                    
                    if(nr<grid.length && nr>=0 && nc<grid[0].length && nc>=0 && grid[nr][nc]==1)
                    {
                        fresh--;
                        grid[nr][nc] = 2;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            count++;
        }
        
        if(fresh!=0) return -1;
        return count-1;
    }
}