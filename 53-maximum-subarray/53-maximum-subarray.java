class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;
        
        int rSum = nums[0];
        int sum = nums[0];
        
        for(int i =1;i<nums.length;i++)
        {
            rSum = Math.max(nums[i],nums[i]+rSum);
            
            sum = Math.max(sum,rSum);
        }
        
        return sum;
    }
}