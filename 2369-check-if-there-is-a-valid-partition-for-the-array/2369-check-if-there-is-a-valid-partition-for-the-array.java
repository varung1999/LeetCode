class Solution {
    public boolean validPartition(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        
        boolean[] dp = new boolean[nums.length+1];
        dp[0] = true;
        
        for(int i = 0;i<nums.length;i++)
        {
            int dpIndex = i + 1;
            if(i>0 && nums[i] == nums[i-1])
            {
                dp[dpIndex] |= dp[dpIndex-2];
            }
            
            if(i>1 && nums[i] == nums[i-1] && nums[i] == nums[i-2])
            {
                dp[dpIndex] |= dp[dpIndex-3];
            }
            
            if(i>1 && nums[i] == nums[i-1] + 1 && nums[i] == nums[i-2] + 2)
            {
                dp[dpIndex] |= dp[dpIndex-3];
            }
        }
        
        return dp[nums.length];
    }
}