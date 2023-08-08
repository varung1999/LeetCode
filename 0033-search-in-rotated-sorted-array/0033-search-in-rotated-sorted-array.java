class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;
        
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] == target) return i;
        }
        
        return -1;
    }
}