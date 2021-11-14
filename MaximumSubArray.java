class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum_till_now = 0, sum_so_far=Integer.MIN_VALUE;
        
        for(int i =0;i<nums.length;i++)
        {
            sum_till_now +=nums[i];
            
            if(sum_till_now>sum_so_far)
            {
                sum_so_far = sum_till_now;
            }
            if(sum_till_now<0)
            {
                sum_till_now =0;
            }
        }
        return sum_so_far;
    }
}
