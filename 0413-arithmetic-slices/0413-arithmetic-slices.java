class Solution {
    int sum = 0;
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        helper(nums,nums.length - 1);
        
        return sum;
    }
    
    private int helper(int[] nums, int i)
    {
        //base
        if(i<2) return 0;
        
        //logic
        int temp = 0;
        if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2])
        {
            temp = 1 + helper(nums,i-1);
            sum+=temp;
        }
        else{
            helper(nums,i-1);
        }
        
        return temp;
    }
}