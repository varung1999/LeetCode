class Solution {
    public int rob(int[] nums) {
        if(nums == null) return 0;
        
//         int n = nums.length;
//         int[][] dp = new int[n][2];
        
//         dp[0][1] = nums[0];
        int skip = 0;
        int take = nums[0];
        
        for(int i = 1;i<nums.length;i++)
        {
            int temp = skip;
            skip = Math.max(skip,take);
            take = nums[i] + temp;
        }
        
        return Math.max(skip,take);
    }
}