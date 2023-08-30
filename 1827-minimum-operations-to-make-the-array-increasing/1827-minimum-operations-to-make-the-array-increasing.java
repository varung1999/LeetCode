class Solution {
    public int minOperations(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int sum = 0;
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i]) continue;
            
            sum+=nums[i-1] - nums[i] + 1;
            nums[i] += nums[i-1] - nums[i] + 1;
        }
        
        return sum;
    }
}