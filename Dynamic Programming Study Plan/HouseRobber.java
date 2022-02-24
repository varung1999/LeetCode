class Solution {
    public int rob(int[] nums) {
        
        int n=nums.length;
        if(n==1)
            return nums[0];       
        int[]dp=new int[n];       
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        int max=dp[0];
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],max+nums[i]);
            max=Math.max(dp[i-1],max);
        }
        return dp[n-1];
    }
}
