class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        return helper(nums,nums.length);
    }
    
    private int helper(int[] nums, int n)
    {
        //base
        if(n==1) return nums[0];
        
        //logic
        for(int i =0;i<n-1;i++)
        {
            nums[i] = (nums[i] + nums[i+1])%10;
        }
        
        return helper(nums,n-1);
    }
}