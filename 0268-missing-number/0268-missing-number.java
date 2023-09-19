class Solution {
    public int missingNumber(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int sum = 0;
        for(int i:nums) sum+=i;
        int n = nums.length;
        return Math.abs(sum - (n*(n+1))/2);
    }
}