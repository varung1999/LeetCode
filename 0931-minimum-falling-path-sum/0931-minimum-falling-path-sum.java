class Solution {
    public int minFallingPathSum(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        
        for(int i = 1;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[0].length;j++)
            {
                if(j==0)
                {
                    matrix[i][j] += Math.min(matrix[i-1][j],matrix[i-1][j+1]); 
                }
                else if(j == matrix[0].length - 1)
                {
                    matrix[i][j] += Math.min(matrix[i-1][j-1],matrix[i-1][j]);
                }
                else 
                {
                    matrix[i][j]+= Math.min(matrix[i-1][j],Math.min(matrix[i-1][j-1],matrix[i-1][j+1]));
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int j=0;j<matrix[0].length;j++)
        {
            min = Math.min(min,matrix[matrix.length-1][j]);
        }
        return min;
    }
}