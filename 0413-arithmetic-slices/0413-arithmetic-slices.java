class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums == null || nums.length<3) return 0;
        
        int count = 0,n = nums.length;
        int[] dp = new int[n];
        
        for(int i = 2;i<n;i++)
        {
            if(nums[i-1] - nums[i-2] == nums[i] - nums[i-1]) dp[i] = 1 + dp[i-1];
        }
        
        for(int i:dp) count+=i;
        return count;
    }
}