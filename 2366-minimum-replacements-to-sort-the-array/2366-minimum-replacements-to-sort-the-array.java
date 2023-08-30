class Solution {
    public long minimumReplacement(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        long  ans = 0;
        int n = nums.length;
        
        for(int i = n-2;i>=0;i--)
        {
            if(nums[i]<=nums[i+1]) continue;
            
            long numElements = (long)(nums[i] + nums[i+1]-1)/(long)nums[i+1];
            
            ans+=numElements-1;
            
            nums[i] = nums[i]/(int)numElements;
            
        }
        
        return ans;
    }
}