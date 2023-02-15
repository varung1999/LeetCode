class Solution {
    public int minimumEffortPath(int[][] heights) {
        
        int[][] dirs = {{0,-1},{0,1},{1,0},{-1,0}};
        boolean[][] visited = new boolean[heights.length][heights[0].length];
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[0]-b[0]);
        q.add(new int[]{0,0,0});
        
        while(!q.isEmpty())
        {
            int[] curr = q.poll();
            int r = curr[1];
            int c = curr[2];
            
            if(r == heights.length -1 && c == heights[0].length - 1) return curr[0];
            
            visited[r][c] = true;
            
            for(int[] dir: dirs)
            {
                int nr = dir[0] + r;
                int nc = dir[1] + c;
                
                if(nr>=0 && nc>=0 && nr<heights.length && nc<heights[0].length && !visited[nr][nc])
                {
                    int diff = Math.max(curr[0],Math.abs(heights[r][c] - heights[nr][nc]));
                    q.add(new int[]{diff,nr,nc});
                }
            }
        }
        return -1;
    }
}