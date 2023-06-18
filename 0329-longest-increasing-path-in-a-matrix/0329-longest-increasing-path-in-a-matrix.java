class Solution {
    int[][] dirs;
    int count=0;
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        dirs = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        int[][] memo = new int[matrix.length][matrix[0].length];
        for(int i = 0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[0].length;j++)
            {
                int len = dfs(matrix,i,j,memo);
                count = Math.max(count,len);
            }
        }
        
        return count;
    }
    
    private int dfs(int[][] matrix, int row, int col,int[][] memo)
    {
        //base
        if(memo[row][col]!=0) return memo[row][col];
        int maxLength = 1;
        
        //logic
        
        for(int[] dir: dirs)
        {
            
            int r = dir[0] + row;
            int c = dir[1] + col;
            
            if(r>=0 && r<matrix.length && c>=0 && c<matrix[0].length &&  matrix[r][c]>matrix[row][col])
            {
                int length = 1 + dfs(matrix,r,c,memo);
                maxLength = Math.max(maxLength,length);
            }
        }
        
        memo[row][col] = maxLength;
        return maxLength;
    }
}