class Solution {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        if(maze == null || maze.length == 0) return false;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start[0],start[1]});
        
        maze[start[0]][start[1]] = 2;
        
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        
        while(!q.isEmpty())
        {
            int[] curr = q.poll();
            
            for(int[] dir: dirs)
            {
                int r = curr[0];
                int c = curr[1];
                while(r>=0 && r<maze.length && c>=0 && c<maze[0].length && maze[r][c]!=1)
                {
                    r = r + dir[0];
                    c = c + dir[1];
                }
                
                r = r - dir[0];
                c = c - dir[1];
                
                if(maze[r][c]!=2)
                {
                    if(r == destination[0] && c == destination[1]) return true;
                    maze[r][c] = 2;
                    q.add(new int[]{r,c});
                }
            }
        }
        
        return false;
    }
}