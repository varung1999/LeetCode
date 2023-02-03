class Solution {
    public void wallsAndGates(int[][] rooms) {
        if(rooms == null || rooms.length == 0) return;
        
        Queue<int[]> q = new LinkedList<>();
        for(int i =0;i<rooms.length;i++)
        {
            for(int j = 0;j<rooms[0].length;j++)
            {
                if(rooms[i][j] == 0) q.add(new int[]{i,j});
            }
        }
        
        if(q.isEmpty()) return;
        
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        int level = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            level++;
            for(int i = 0;i<size;i++)
            {
                int[] curr = q.poll();
                
                for(int[] dir: dirs)
                {
                    int nr = dir[0] + curr[0];
                    int nc = dir[1] + curr[1];
                    
                    if(nr<rooms.length && nr>=0 && nc<rooms[0].length && nc>=0 && rooms[nr][nc] == Integer.MAX_VALUE)
                    {
                        rooms[nr][nc] = Math.min(rooms[nr][nc],level);
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }
    }
}