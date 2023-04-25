class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return Math.max(helper(nums,0,nums.length-1) , helper(nums,1,nums.length)); 
    }
    
    private int helper(int nums[], int start, int length)
    {
        int skip = 0, take = nums[start];
        
        for(int i = start+1;i<length;i++)
        {
            int temp = skip;
            skip = Math.max(skip,take);
            take = temp + nums[i];
        }
        
        return Math.max(skip,take);
    }
}