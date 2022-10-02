class Solution {
    public boolean canPartition(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        
        int sum = 0;
        for(int i : nums)
        {
            sum+=i;
        }
        
        if(sum%2!=0) return false;
        sum/=2;
        
        boolean[][] dp = new boolean[nums.length+1][sum+1];
        
        for(int i=0;i<dp.length;i++)
        {
            for(int j = 0;j<dp[0].length;j++)
            {
                if(i==0 && j == 0) dp[i][j] = true;
                else if(i==0 || j == 0) dp[i][j]=false;
                else if(nums[i-1]>j) dp[i][j] = dp[i-1][j];
                else if(nums[i-1] == j) dp[i][j] = true;
                else dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
            }
        }
        
        
        
        return dp[nums.length][sum];
    }
}