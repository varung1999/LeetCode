class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums == null || nums.length<3) return 0;
        
        int count = 0,n = nums.length;
        
        for(int i = 0;i<n-1;i++)
        {
            int diff = nums[i+1] - nums[i];
            
            for(int j = i+1;j<n-1;j++)
            {
                if(nums[j+1]-nums[j] == diff) count++;
                else break;
            }
        }
        
        return count;
    }
}