class Solution {
    public int[][] generateMatrix(int n) {
        if(n == 0) return new int[][]{};
        
        int[][] ans = new int[n][n];
        int start = 1;
        
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        
        while(top<=bottom && left<=right)
        {
            for(int j = left;j<=right;j++)
            {
                ans[top][j] = start++;
            }
            top++;
            
            if(top<=bottom && left<=right)
            {
                for(int i = top;i<=bottom;i++)
                {
                    ans[i][right] = start++;
                }
                right--;
            }
            
            if(top<=bottom)
            {
                for(int j = right;j>=left;j--)
                {
                    ans[bottom][j] = start++;
                }
                bottom--;
            }
            
            if(left<=right)
            {
                for(int i = bottom;i>=top;i--)
                {
                    ans[i][left] = start++;
                }
                left++;
            }
        }
        return ans;
    }
}