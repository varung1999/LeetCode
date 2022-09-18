class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] matrix = new int[n][n];
        for(int i = 0;i<n;i++) Arrays.fill(matrix[i],1);
        for(int[] m : mines) matrix[m[0]][m[1]] = 0;
        
        int order = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(matrix[i][j] ==0) continue;
                int leftCount  =0;
                int k = j;
                while(k>=0 && matrix[i][k]==1)
                {
                    leftCount++;
                    k--;
                }
                
                int rightCount = 0;
                k = j;
                while(k<n && matrix[i][k] == 1)
                {
                    rightCount++;
                    k++;
                }
                
                int topCount = 0;
                k = i;
                while(k>=0 && matrix[k][j] == 1)
                {
                    topCount ++;
                    k--;
                }
                
                int bottomCount = 0;
                k = i;
                while(k<n && matrix[k][j]==1)
                {
                    bottomCount++;
                    k++;
                }
                
                int rowMin = Math.min(leftCount,rightCount);
                int colMin = Math.min(topCount,bottomCount);
                
                order = Math.max(order,Math.min(rowMin,colMin));
            }
        }
        
        return order;
        
    }
}