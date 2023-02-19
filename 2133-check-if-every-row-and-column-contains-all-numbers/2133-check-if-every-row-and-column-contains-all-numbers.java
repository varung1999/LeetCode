class Solution {
    public boolean checkValid(int[][] matrix) {
        
        for(int r = 0;r<matrix.length;r++)
        {
            HashSet<Integer> rows = new HashSet<>();
            HashSet<Integer> cols = new HashSet<>();
            
            for(int c = 0;c<matrix.length;c++)
            {
                if(!rows.add(matrix[r][c]) || !cols.add(matrix[c][r])) return false;
            }
        }
        return true;
    }
}