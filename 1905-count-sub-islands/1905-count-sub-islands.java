class Solution {
    int total;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        if(grid2 == null || grid2.length == 0) return 0;
        
        total = 0;
        for(int i =0;i<grid2.length;i++)
        {
            for(int j = 0;j<grid2[0].length; j++)
            {
                if(grid2[i][j] == 1)
                {
                    if(dfs(grid1,grid2,i,j)){
                        total++;
                    }
                    
                }
            }
        }
        
        return total;
        
    }
    
    private boolean dfs(int[][] grid1,int[][] grid2,int r,int c)
    {
        //base
        if(r<0 || c<0 || r>=grid1.length || c>=grid1[0].length || grid2[r][c]!=1) return true;
        
        if(grid1[r][c]!=grid2[r][c]) return false;
        
        //logic
        grid1[r][c]=0;
        grid2[r][c] = 0;
        
        boolean a = dfs(grid1,grid2,r-1,c);
        boolean b = dfs(grid1,grid2,r+1,c);
        boolean x = dfs(grid1,grid2,r,c-1);
        boolean d = dfs(grid1,grid2,r,c+1);
        
        return a && b && x && d;
    }
}