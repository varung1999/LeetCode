class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat == null || mat.length == 0) return 0;
        
        int i = 0, j = 0;
        
        int sum = 0;
        
        while(i<mat.length && j<mat[0].length)
        {
            sum+=mat[i++][j++];
        }
        
        i=0;
        j = mat[0].length - 1;
        
        while(i<mat.length && j>=0)
        {
            sum+=mat[i++][j--];
        }
        
        if(mat.length%2!=0) sum = sum - mat[mat.length/2][mat[0].length/2];
        
        return sum;
    }
}