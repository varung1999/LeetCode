class Solution {
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        
        int[][] distance = new int[maze.length][maze[0].length];
        
        for(int[] dist:distance) Arrays.fill(dist,Integer.MAX_VALUE);
        
        distance[start[0]][start[1]] = 0;
        
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start[0],start[1]});
        
        while(!q.isEmpty())
        {
            int[] curr = q.poll();
            int distTillNow = distance[curr[0]][curr[1]];
            
            for(int[] dir:dirs)
            {
                int r = dir[0] + curr[0];
                int c = dir[1] + curr[1];
                int pathCount = distTillNow+1;
                while(r>=0 && r<maze.length && c>=0 && c<maze[0].length && maze[r][c] == 0)
                {
                    r +=dir[0];
                    c +=dir[1];
                    pathCount++;
                }
                
                r-=dir[0];
                c-=dir[1];
                pathCount--;
                
                if(!Arrays.equals(curr,destination) && pathCount<distance[r][c])
                {
                    distance[r][c] = pathCount;
                    q.add(new int[]{r,c});
                }
            }
        }
        
        int res = distance[destination[0]][destination[1]];
        
        return res == Integer.MAX_VALUE? -1: res;
    }
}