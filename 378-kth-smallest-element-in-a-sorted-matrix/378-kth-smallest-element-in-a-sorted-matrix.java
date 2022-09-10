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
        int j = matrix.length - 1;
        
        for(int i =0;i<matrix.length;i++)
        {
            while(j>=0 && matrix[i][j]>target) j--;
            count+= j+1;
        }
        return count;
    }
}