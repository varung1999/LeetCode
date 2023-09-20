class Solution {
    public int minOperations(int[] nums, int x) {
        if(nums == null || nums.length == 0) return 0;
        int totalSum = 0;
        for(int i:nums) totalSum+=i;
        
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        
        int left = 0;
        
        for(int right = 0;right<n;right++)
        {
            totalSum-=nums[right];
            
            while(totalSum<x && left<=right)
            {
                totalSum+=nums[left++];
            }
            
            if(totalSum == x) mini = Math.min(mini, (n - 1 - right) + left);
        }
        return mini != Integer.MAX_VALUE? mini : -1;
    }
    
}