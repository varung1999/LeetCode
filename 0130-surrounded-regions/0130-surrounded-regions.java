class Solution {
    int[][] dirs;
    public void solve(char[][] board) {
        if(board == null || board.length == 0) return;
        dirs = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        boolean[][] visited = new boolean[board.length][board[0].length];
        
        for(int i = 0;i<board.length;i++)
        {
            if(board[i][0] == 'O' && visited[i][0] == false)
            {
                dfs(board,visited,i,0);
            }
            
            if(board[i][board[0].length-1]=='O' && visited[i][board[0].length-1]==false)
            {
                dfs(board,visited,i,board[0].length-1);
            }
        }
        
        
        for(int j = 0;j<board[0].length;j++)
        {
            if(board[0][j]=='O' && visited[0][j]==false)
            {
                dfs(board,visited,0,j);
            }
            
            if(board[board.length-1][j] == 'O' && visited[board.length-1][j]==false)
            {
                dfs(board,visited,board.length-1,j);
            }
        }
        
        
        for(int i = 0; i<board.length;i++)
        {
            for(int j = 0;j<board[0].length;j++)
            {
                if(board[i][j] == 'O' && visited[i][j] == false)
                {
                    board[i][j] = 'X';
                }
            }
        }
        
    }
    
    private void dfs(char[][] board,boolean[][] visited, int r, int c)
    {
        //base
        
        
        //logic
        visited[r][c] = true;
        for(int[] dir: dirs)
        {
            int nr = dir[0] + r;
            int nc = dir[1] + c;
            
            if(nr>=0 && nr<board.length && nc>=0 && nc<board[0].length && board[nr][nc]=='O' && visited[nr][nc]==false)
            {
                dfs(board,visited,nr,nc);
            }
        }
    }
}