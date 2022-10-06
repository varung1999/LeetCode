class Solution {
    public int numSubmat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        int[][] arr = new int[n][m];
        
        for(int i =0;i<n;i++)
        {
            int count = 0;
            for(int j = m - 1;j>=0;j--)
            {
                if(mat[i][j] == 1)
                {
                    count++;
                }
                else{
                    count = 0;
                }
                
                arr[i][j] = count;
            }
        }
        
        int ans = 0;
        
        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                int x = Integer.MAX_VALUE;
                for(int k = i;k<n;k++)
                {
                    x = Math.min(x,arr[k][j]);
                    ans+=x;
                }
            }
        }
        
        return ans;
    }
}