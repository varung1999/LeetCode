class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        if(nums == null || nums.length == 0) return false;
        
        int count = 0;
        for(int num: nums)
        {
            count = num == target? count + 1:count;
        }
        
        return count>nums.length/2;
    }
}