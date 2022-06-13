class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        if(grid == null || grid.length == 0) return 0;
        
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        
        int sum = 0,maxSum = 0;
        Queue<int[]> q = new LinkedList<>();
        
        for(int i =0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    grid[i][j]=0;
                    sum = 1;
                    q.add(new int[]{i,j});
                    
                    
                    while(!q.isEmpty())
                    {
                        int[] curr = q.poll();
                        
                        for(int[] dir: dirs){
                            int r = curr[0] + dir[0];
                            int c = curr[1] + dir[1];
                        
                        
                            if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c] == 1)
                            {
                                q.add(new int[]{r,c});
                                grid[r][c] = 0;
                                sum++;
                            }
                        }
                    }
                    maxSum = Math.max(sum,maxSum);
                }
            }
        }
        
        return maxSum;
        
    }
}
