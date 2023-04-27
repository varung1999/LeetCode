class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax = 0, currMin = 0, maxSum = nums[0], minSum = nums[0];
        int sum = 0;
        for(int num:nums)
        {
            currMax = Math.max(currMax,0) + num;
            maxSum = Math.max(maxSum,currMax);
            currMin = Math.min(currMin,0) + num;
            minSum = Math.min(minSum,currMin);
            
            sum+=num;
        }
        
        if(sum == minSum) return maxSum;
        return Math.max(maxSum, sum - minSum);
    }
}