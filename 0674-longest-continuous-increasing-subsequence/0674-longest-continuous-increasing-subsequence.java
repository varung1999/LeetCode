class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int ans = 0,count = 0;
        
        for(int i = 0;i<nums.length;i++)
        {
            if(i == 0) count++;
            else{
                if(nums[i]>nums[i-1]) count++;
                else{
                    ans = Math.max(ans,count);
                    count = 1;
                }
            }
        }
        
        return Math.max(ans,count);
        
    }
}