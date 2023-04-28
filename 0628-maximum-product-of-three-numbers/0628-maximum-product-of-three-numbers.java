class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int first = nums[0]*nums[1]*nums[nums.length-1];
        int last = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        return Math.max(first,last);
    }
}