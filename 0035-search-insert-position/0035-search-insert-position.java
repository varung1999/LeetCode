class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;
        
        int i = 0;
        while(i<nums.length)
        {
            if(nums[i]>=target) return i;
            i++;
        }
        
        return i;
    }
}