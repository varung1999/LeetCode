class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int max_so_far = 0, max_till_now = Integer.MIN_VALUE;
        
        for(int i = 0;i<nums.length;i++)
        {
            max_so_far+=nums[i];
            
            if(max_so_far>max_till_now)
            {
                max_till_now = max_so_far;
            }
            if(max_so_far<0) max_so_far = 0;
        }
        
        return max_till_now;
    }
}