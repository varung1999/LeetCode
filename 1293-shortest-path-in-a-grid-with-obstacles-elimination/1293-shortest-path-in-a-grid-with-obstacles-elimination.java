class Solution {
    public int shortestPath(int[][] grid, int k) {
        if(grid == null || grid.length == 0) return 0;
        
        int m = grid.length;
        int n = grid[0].length;
        
        boolean[][][] visited = new boolean[m][n][k+1];
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,k});
        visited[0][0][k] = true;
        int count = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            
            for(int i = 0;i<size;i++)
            {
                int[] curr = q.poll();
                if(curr[0] == m - 1 && curr[1] == n - 1) return count;
                for(int[] dir: dirs)
                {
                    int r = curr[0] + dir[0];
                    int c = curr[1] + dir[1];
                    
                    if(r>=0 && c>=0 && r<m && c<n){
                        int K = curr[2] - grid[r][c];
                        if(K>=0 && !visited[r][c][K]){
                            q.add(new int[]{r,c,K});
                            visited[r][c][K] = true;
                        }
                    }
                }
            }
            count++;
        }
        
        return -1;
     }
}