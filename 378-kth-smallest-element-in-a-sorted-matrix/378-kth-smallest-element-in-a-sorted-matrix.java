class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix == null || matrix.length == 0) return 0;
        
        int left = matrix[0][0], right = matrix[matrix.length-1][matrix.length - 1];
        
        while(left<right)
        {
            int mid = left + (right - left)/2;
            int count = helper(matrix,mid);
            if(count<k) left = mid + 1;
            else right = mid;
        }
        
        return left;
        
    }
    
    private int helper(int[][] matrix, int target)
    {
        int count = 0;
        int i = matrix.length - 1;
        int j = 0;
        
        while(i>=0 && j<matrix.length)
        {
            if(matrix[i][j]>target)
            {
                i--;
            }
            else{
                count+=i+1;
                j++;
            }
        }
        return count;
    }
}