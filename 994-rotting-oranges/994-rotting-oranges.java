class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i =0;i<grid.length;i++)
        {
            for(int j =0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 2)
                {
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j] == 1) fresh++;
            }
        }
        
        if(fresh ==0) return 0;
        int time = -1;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty())
        {
            time++;
            int size = q.size();
            for(int i =0;i<size;i++){
                int[] curr = q.poll();

                for(int dir[]:dirs)
                {
                    int r = dir[0] + curr[0];
                    int c = dir[1] + curr[1];

                    if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && grid[r][c] == 1)
                    {
                        grid[r][c] = 2;
                        fresh--;
                        q.add(new int[]{r,c});
                    }
                }
            }
        }
        
        
        return fresh == 0? time:-1;
    }
}