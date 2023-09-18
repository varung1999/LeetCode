class Solution {
    public int minMoves2(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        Arrays.sort(nums);
        int mid = nums.length/2;
        
        int count = 0;
        for(int i:nums) count+= Math.abs(i-nums[mid]);
        
        return count;
    }
}