class Solution {
    public int findDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int ans = -1;
        for(int i = 0;i<nums.length;i++)
        {
            int curr = Math.abs(nums[i]);
            if(nums[curr]<0)
            {
                return curr;
            }
            nums[curr]*=-1;
        }
        
        return ans;
    }
}