class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet visited = new HashSet<>();
        
        for(int i =0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char curr = board[i][j];
                
                if(curr!='.')
                {
                    if(!visited.add(curr + " in row " + i) || !visited.add(curr +" in column "+j) || !visited.add(curr + " in block "+ i/3 +" - " + j/3))
                    {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}