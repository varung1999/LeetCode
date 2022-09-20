class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        if(n1==0 || n2 == 0) return 0;
        int max =0;
        int[][] dp = new int[n1+1][n2+1];
        
        for(int i = n1-1;i>=0;i--)
        {
            for(int j = n2-1;j>=0;j--)
            {
                if(nums1[i]==nums2[j])
                {
                    dp[i][j] = dp[i+1][j+1] + 1;
                    
                }
                max = Math.max(max,dp[i][j]);
            }
        }
        
        return max;
    }
}