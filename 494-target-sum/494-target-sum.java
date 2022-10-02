class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int index = nums.length - 1;
        
        return dp(nums,target,index,0);
    }
    
    private int dp(int[] nums, int target, int index, int currSum)
    {
        //base
        if(index<0 && currSum == target) return 1;
        if(index<0) return 0;
        
        //logic
        int pos = dp(nums,target,index-1,currSum+nums[index]);
        int neg = dp(nums,target,index-1,currSum - nums[index]);
        
        return pos + neg;
    }
}