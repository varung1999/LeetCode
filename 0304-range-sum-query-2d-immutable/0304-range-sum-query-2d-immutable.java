class NumMatrix {

    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        prefix = new int[matrix.length][matrix[0].length];
        
        for(int i = 0;i<prefix.length;i++)
        {
            for(int j = 0;j<prefix[0].length;j++)
            {
                if(j==0)
                {
                    prefix[i][j] = matrix[i][j];
                }
                else{
                    prefix[i][j] = matrix[i][j] + prefix[i][j-1];
                }
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        if (row2 >= prefix.length || col2 >= prefix[0].length || row1 < 0 || col1 < 0) return -1;
        for(int i = row1;i<=row2;i++)
        {
            sum = sum + prefix[i][col2];
            if(col1>0)
            {
                sum-=prefix[i][col1-1];
            }
            
        }
        
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */