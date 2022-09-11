class Solution {
    public int minStartValue(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int min = 0;
        int sum = 0;
        for(int i:nums)
        {
            sum+=i;
            min = Math.min(min,sum);
        }
        
        return 1 - min;
    }
}