class Solution {
    int count = 0;
    boolean[][] board;
    public int totalNQueens(int n) {
        if(n == 0) return 0;
        board = new boolean[n][n];
        dfs(0);
        
        return count;
    }
    
    private void dfs(int row)
    {
        //base
        if(row == board.length)
        {
            count++;
            return;
        }
        
        //logic
        for(int i =0;i<board.length;i++)
        {
            if(isSafe(row,i))
            {
                board[row][i] = true;
                
                dfs(row+1);
                
                board[row][i] = false;
            }
        }
    }
    
    private boolean isSafe(int row, int col)
    {
        for(int i =0;i<row;i++)
        {
            if(board[i][col] == true) return false;
        }
        
        int i = row, j = col;
        
        while(i>=0 && j<board.length)
        {
            if(board[i][j] == true) return false;
            i--;
            j++;
        }
        
        i = row;
        j = col;
        while(i>=0 && j>=0)
        {
            if(board[i][j] == true) return false;
            i--;
            j--;
        }
        return true;
    }
    
}