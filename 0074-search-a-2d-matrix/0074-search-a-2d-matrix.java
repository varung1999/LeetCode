class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        
        int n = matrix.length;
        int m = matrix[0].length;
        int foundRow = -1;
        for(int i = 0;i<n;i++){
            int first = matrix[i][0];
            int last = matrix[i][m-1];
            
            if(target>=first && target<=last)
            {
                foundRow = i;
                break;
            }
        }
        if(foundRow==-1)return false;
        return binarySearch(matrix[foundRow],target);
    }
    
    private boolean binarySearch(int[] matrix, int target){
        int low = 0, high = matrix.length - 1;
        
        while(low<=high){
            int mid = (low + (high-low)/2);
            
            if(matrix[mid] == target) return true;
            else if(matrix[mid]<target)low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}