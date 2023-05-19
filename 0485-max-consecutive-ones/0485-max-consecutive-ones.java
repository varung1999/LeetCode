class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int ans = 0, count = 0;
        
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] == 1)
            {
                count++;
            }
            else{
                ans = Math.max(count, ans);
                count = 0;
            }
        }
        
        return Math.max(ans,count);
    }
}