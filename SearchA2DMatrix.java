// class Solution {  Time Complexity: O(n*m) 
//     public boolean searchMatrix(int[][] matrix, int target) {
        
//         for(int i=0;i<matrix.length;i++)
//         {
//             for(int j =0;j<matrix[0].length;j++)
//             {
//                 if(matrix[i][j]==target)
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

//Efficient Way to solve: 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int l = 0, r = matrix.length * matrix[0].length - 1, mid;
        
        while (l <= r) {
            
            mid = l + (r - l) / 2;
            
            int cur = matrix[mid / matrix[0].length]
                [mid % matrix[0].length];
            
            if (cur == target)
                return true;
            else if (cur > target)
                r = mid - 1;
            else 
                l = mid + 1;
        }
         
        return false;
    }
}
