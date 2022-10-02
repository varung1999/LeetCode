class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int maxSum = nums[0],sum = nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            sum = Math.max(sum+nums[i],nums[i]);
            maxSum = Math.max(maxSum,sum);
        }
        
        return maxSum;
    }
}