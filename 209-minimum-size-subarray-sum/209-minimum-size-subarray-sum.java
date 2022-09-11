class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int sum = 0;
        for(int i:nums)
        {
            sum+=i;
        }
        if(target>sum) return 0;
        
        int i =0,j=0;
        sum = 0;
        int min = Integer.MAX_VALUE;
        while(i<nums.length)
        {
            sum+=nums[i];
            if(sum>=target)
            {
                while(sum>=target)
                {
                    sum-=nums[j];
                    min = Math.min(min,i-j+1);
                    j++;
                }
            }
            i++;
        }
        
        return min;
    }
}