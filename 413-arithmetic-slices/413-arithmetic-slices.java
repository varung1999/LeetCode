class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums == null || nums.length<3) return 0;
        
        int n = nums.length;
        int count = 0;
        
        int prev = 0;
        
        //bottom to top 
        
        for(int i = n - 3; i>=0;i--)
        {
            if(nums[i+2] - nums[i+1] == nums[i+1] - nums[i])
            {
                prev = prev + 1;
                count+=prev;
            }
            else
            {
                prev = 0;
            }
        }
        
        return count;
    }
}