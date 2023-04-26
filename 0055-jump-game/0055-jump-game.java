class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        
        int lastPos = nums.length - 1;
        
        for(int i = nums.length - 1;i>=0;i--)
        {
            if(i+nums[i]>=lastPos)
            {
                lastPos = i;
            }
        }
        
        return lastPos == 0;
    }
}