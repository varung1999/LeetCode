class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int sum = 0;
        for(int i =1;i<nums.length;i+=2)
        {
            int temp = Math.min(nums[i-1],nums[i]);
            sum+=temp;
        }
        
        return sum;
    }
}