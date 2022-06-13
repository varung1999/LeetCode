class Solution {
    public int closedIsland(int[][] grid) {
        
        if(grid == null || grid.length == 0) return 0;
        
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        
        int  total = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 1;i<rows - 1;i++)
        {
            for(int j = 1;j<cols - 1;j++)
            {
                if(grid[i][j] == 0)
                {
                    q.add(new int[]{i,j});
                    grid[i][j] = 1;
                    boolean closed = true;
                    
                    //DO BFS here
                    
                    while(!q.isEmpty())
                    {
                        int[] curr = q.poll();
                        
                        for(int[] dir: dirs)
                        {
                            int r = curr[0] + dir[0];
                            int c = curr[1] + dir[1];
                            
                            if(r<0 || c< 0 || r>= rows || c>= cols)
                            {
                                closed = false;
                                continue;
                            }
                            
                            if(grid[r][c] == 0)
                            {
                                q.add(new int[]{r,c});
                                grid[r][c] = 1;
                            }
                            
                        }
                    }
                    
                    if(closed) total ++;
                }
            }
        }
        
        return total;
        
    }
    
   
}
