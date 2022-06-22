class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int n = nums.length;
        
        int[] dp = new int[n];
        dp[0]= nums[0];
        int len = 1;
        
        for(int i = 1;i<n;i++)
        {
            if(nums[i]>dp[len - 1])
            {
                dp[len] = nums[i];
                len++;
            }
            else
            {
                int bsIndex = binarySearch(dp,0,len - 1, nums[i]);
                dp[bsIndex] = nums[i];
            }
        }
        
        return len;
    }
    
    private int binarySearch(int[] dp, int si,int ei, int target)
    {
        while(si<=ei)
        {
            int mid = si + (ei - si)/2;
            
            if(dp[mid]==target)
            {
                return mid;
            }
            else if(target< dp[mid])
            {
                ei = mid - 1;
            }
            else
            {
                si = mid + 1;
            }
        }
        
        return si;
    }
}