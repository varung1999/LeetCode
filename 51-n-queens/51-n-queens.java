class Solution {
    List<List<String>> result;
    boolean[][] grid;
    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<>();
        if(n == 0)  return result;
        
        grid = new boolean[n][n];
        backtracking(0);
        
        return result;
    }
    
    private void backtracking(int row)
    {
        //base
        if(row == grid.length)
        {
            List<String> newList = new ArrayList<>();
            for(int i =0;i<grid.length;i++)
            {
                StringBuilder sb = new StringBuilder();
                for(int j =0;j<grid[0].length;j++)
                {
                    if(grid[i][j] == true)
                    {
                        sb.append('Q');
                    }
                    else{
                        sb.append('.');
                    }
                }
                
                newList.add(sb.toString());
            }
            result.add(newList);
            return;
        }
        
        //logic
        for(int i =0;i<grid.length;i++)
        {
            if(isSafe(row,i))
            {
                grid[row][i] = true;
                
                backtracking(row+1);
                
                grid[row][i] = false;
            }
        }
    }
    
    private boolean isSafe(int row, int col)
    {
        for(int i =0;i<row;i++)
        {
            if(grid[i][col] == true) return false;
        }
        
        int i = row, j = col;
        
        while(i>=0 && j<grid.length)
        {
            if(grid[i][j] ==  true) return false;
            
            i--;
            j++;
        }
        
        i=row;
        j=col;
        
        while(i>=0 && j>=0)
        {
            if(grid[i][j] == true) return false;
            i--;
            j--;
        }
        
        return true;
    }
}