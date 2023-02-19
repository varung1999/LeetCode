class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];
        
        for(int r = 0;r<n;r++)
        {
            rows[r] = new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }
        
        for(int r = 0;r<n;r++)
        {
            for(int c = 0;c<n;c++)
            {
                char curr = board[r][c];
                
                if(curr=='.') continue;
                if(rows[r].contains(curr)) return false;
                rows[r].add(curr);
                if(cols[c].contains(curr)) return false;
                cols[c].add(curr);
                
                int idx = (r/3)*3 + c/3;
                if(boxes[idx].contains(curr)) return false;
                boxes[idx].add(curr);
            }
        }
        return true;
    }
}