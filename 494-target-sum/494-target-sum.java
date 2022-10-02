class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;
        
        int sum = 0;
        for(int i:nums)sum+=i;
        if(target<-sum || target>sum) return 0;
        
        int[][] dp = new int[nums.length+1][2*sum+1];
        dp[0][sum]=1;
        
        for(int i = 1;i<dp.length;i++)
        {
            for(int j = 0;j<dp[0].length;j++)
            {
                if(j + nums[i-1]<=sum*2)
                {
                    dp[i][j]+=dp[i-1][j+nums[i-1]];
                }
                if(j - nums[i-1]>=0)
                {
                    dp[i][j]+=dp[i-1][j-nums[i-1]];
                }
            }
        }
        
        return dp[nums.length][sum+target];
        
    }
}