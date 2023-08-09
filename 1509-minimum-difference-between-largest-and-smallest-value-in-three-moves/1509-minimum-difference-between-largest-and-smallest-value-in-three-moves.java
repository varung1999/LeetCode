class Solution {
    public int minDifference(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int n = nums.length;
        if(n<5) return 0;
        
        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0;i<4;i++)
        {
            res = Math.min(res,nums[n-4+i] - nums[i]);
        }
        
        return res;
    }
}