class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums == null || nums.length<3) return 0;
        
        int count = 0,n = nums.length;
        int currCount = 0;
        
        for(int i = 2;i<n;i++)
        {
            if(nums[i-1] - nums[i-2] == nums[i] - nums[i-1]){
                currCount+=1;
                count+=currCount;
            }
            else{
                currCount = 0;
            }
        }
         
        return count;
    }
}