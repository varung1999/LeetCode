class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[]{-1,-1};
        
        int start = -1;
        int end = -1;
        
        int i =0;
        while(i<nums.length)
        {
            if(nums[i]==target)
            {
                start = i;
                break;
            }
            i++;
        }
        
        while(i<nums.length)
        {
            if(nums[i]==target)
            {
                end = Math.max(end,i);
            }
            i++;
        }
        
        
        return new int[]{start,end};
    }
}