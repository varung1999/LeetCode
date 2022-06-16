class Solution {
    public int maxDistance(int[][] grid) {
        if(grid == null || grid.length == 0)
        {
            return -1;
        }
        
        Queue<int[]> q = new LinkedList<>();
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        int total =-1;
        
        for(int i =0;i<grid.length;i++)
        {
            for(int j =0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                {
                    grid[i][j] =0;
                    q.add(new int[]{i,j});
                }
                else
                {
                    grid[i][j] = Integer.MIN_VALUE;
                }

            }
        }
        
        while(!q.isEmpty())
        {
            int[] curr = q.poll();
            
            for(int[] dir: dirs)
            {
                int r = dir[0]+curr[0];
                int c = dir[1]+curr[1];
                
                if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c]<0)
                {
                    q.add(new int[]{r,c});
                    
                    grid[r][c] = grid[curr[0]][curr[1]]+1;
                    total = Math.max(total,grid[r][c]);
                }
            }
        }
        return total==-1?-1 : total;
    }
}