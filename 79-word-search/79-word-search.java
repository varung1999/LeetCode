class Solution {
    int m,n;
    int[][] dirs;
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0) return false;
        m = board.length;
        n = board[0].length;
        
        dirs = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        
        for(int i =0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(backtracking(board,word,i,j,0) == true) return true;
            }
        }
        
        return false;
    }
    
    private boolean backtracking(char[][] board, String word, int row, int col, int index)
    {
        //base
        if(index == word.length())
        {
            return true;
        }
        if(row<0 || col<0 || row==board.length || col == board[0].length || board[row][col]=='#')
        {
            return false;
        }
        
        //logic
        if(word.charAt(index) == board[row][col])
        {
            //action
            char temp = board[row][col];
            board[row][col] = '#';
        
            for(int[] dir: dirs)
            {
                int r = row + dir[0];
                int c = col + dir[1];
                
                if(backtracking(board,word,r,c,index+1) == true) return true;
                
                
            }
            board[row][col] = temp;
        }
        
        return false;
    }
}