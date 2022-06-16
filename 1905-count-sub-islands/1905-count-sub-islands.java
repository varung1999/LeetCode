class Solution {
    int total;
    boolean isIsland;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        if(grid2 == null || grid2.length == 0) return 0;
        
        total = 0;
        for(int i =0;i<grid2.length;i++)
        {
            for(int j = 0;j<grid2[0].length; j++)
            {
                if(grid2[i][j] == 1)
                {
                    isIsland = true;
                    dfs(grid1,grid2,i,j);
                        
                        if(isIsland)
                        {
                            total++;
                        } 
                }
            }
        }
        
        return total;
        
    }
    
    private void dfs(int[][] grid1,int[][] grid2,int r,int c)
    {
        //base
        if(r<0 || c<0 || r>=grid1.length || c>=grid1[0].length || grid2[r][c]!=1) return;
        
        if(grid1[r][c]!=grid2[r][c]){
            isIsland = false;
        }
        
        //logic
        grid1[r][c]=0;
        grid2[r][c] = 0;
        
        dfs(grid1,grid2,r-1,c);
        dfs(grid1,grid2,r+1,c);
        dfs(grid1,grid2,r,c-1);
        dfs(grid1,grid2,r,c+1);
        
        
    }
}