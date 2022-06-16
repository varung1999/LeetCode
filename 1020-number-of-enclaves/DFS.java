class Solution {
    boolean temp = true;
    int count;
    public int numEnclaves(int[][] grid) {
        if(grid == null || grid.length == 0)
        {
            return 0;
        }
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        int total = 0;
        
        for(int i = 0;i<rows;i++)
        {
            for(int j =0;j<cols;j++)
            {
                if(grid[i][j] == 1)
                {
                    temp = true;
                    count = 0;
                    helper(grid,i,j);
                    if(temp)
                    {
                        total+=count;
                    }
                }
            }
        }
        
        return total;
    }
    
    private void helper(int[][] grid, int r, int c)
    {
        //base
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]==0)
        {
            return;
        }
        
        //logic
        if(r==0 || r==grid.length-1 || c ==0 || c==grid[0].length-1)
        {
           temp = false;
        }
        grid[r][c] = 0;
        count++;
        helper(grid, r-1,c);
        helper(grid,r+1,c);
        helper(grid,r,c-1);
        helper(grid,r,c+1);
        
        
    }
    
    
}
