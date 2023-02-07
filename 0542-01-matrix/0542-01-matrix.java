class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[][]{};
        
        Queue<int[]> q = new LinkedList<>();
        for(int i  = 0;i<mat.length;i++)
        {
            for(int j = 0;j<mat[0].length;j++)
            {
                if(mat[i][j] == 0)
                {
                    q.add(new int[]{i,j});
                }
                else{
                    mat[i][j] = -1;
                }
            }
        }
        
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        int level = 1;
        
        while(!q.isEmpty())
        {
            int size = q.size();
            
            
            for(int i = 0;i<size;i++)
            {
                int[] curr = q.poll();
                for(int[] dir: dirs)
                {
                    int nr = dir[0] + curr[0];
                    int nc = dir[1] + curr[1];

                    if(nr>=0 && nr<mat.length && nc>=0 && nc<mat[0].length && mat[nr][nc]==-1)
                    {
                        mat[nr][nc]=level;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            level++;
        }
        
        return mat;
    }
}