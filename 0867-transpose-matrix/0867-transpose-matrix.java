class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[][]{};
        
        int[][] result = new int[matrix[0].length][matrix.length];
        
        // int mat_i = 0, mat_j = 0;
        
        
        for(int i = 0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[0].length;j++)
            {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}