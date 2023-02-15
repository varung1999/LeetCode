class Solution {
    public int maximumMinimumPath(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        Queue<int[]> q = new PriorityQueue<>((a,b)->b[0]-a[0]);
        
        q.add(new int[]{grid[0][0],0,0});
        
        while(!q.isEmpty())
        {
            int[] curr = q.poll();
            int r = curr[1];
            int c = curr[2];
            
            if(r==grid.length-1 && c == grid[0].length - 1) return curr[0];
            
            visited[r][c] = true;
            
            for(int[] dir: dirs)
            {
                int nr = dir[0] + r;
                int nc = dir[1] + c;
                
                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && visited[nr][nc]==false)
                {
                    q.add(new int[]{Math.min(curr[0],grid[nr][nc]),nr,nc});
                }
            }
        }
        
        return -1;
    }
}