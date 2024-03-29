class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid == null || grid.length == 0) return -1;
        
        int length = 0;
        
        int row = grid.length;
        int col = grid[0].length;
        
        if(grid[0][0]== 1 || grid[row-1][col-1] == 1) return -1;
        
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        
        grid[0][0] = Integer.MIN_VALUE;
        
        while(!q.isEmpty())
        {
            int size = q.size();
            length++;
            
            for(int i =0;i<size;i++)
            {
                int[] curr = q.poll();
                
                if(curr[0]==row -1 && curr[1] == col -1)
                {
                    return length;
                }
                
                for(int[] dir: dirs)
                {
                    int r = dir[0] + curr[0];
                    int c = dir[1] + curr[1];
                    
                    if(r<0 || c<0 || r>=row || c>=col || grid[r][c]<0 || grid[r][c] == 1)
                    {
                        continue;
                    }
        
                    grid[r][c] = Integer.MIN_VALUE;
                    q.add(new int[]{r,c});
                }
            }
        }
        
        return -1;
    }
}
