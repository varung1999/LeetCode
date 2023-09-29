class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums == null || nums.length == 0) return true;
        
        boolean first = true;
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1]) {
                first = false;
                break;
            }
        }
        
        
        boolean second = true;
        
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1]){
                second = false;
                break;
            }
        }
        return (first | second);
    }
}