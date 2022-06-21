class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums == null || nums.length<3) return 0;
        
        int n = nums.length;
        int count = 0;
        
        int[] dp = new int[n];
        
        //bottom to top 
        
        for(int i = n - 3; i>=0;i--)
        {
            if(nums[i+2] - nums[i+1] == nums[i+1] - nums[i])
            {
                dp[i] = dp[i+1]+1;
                count = count+dp[i];
            }
        }
        
        return count;
    }
}