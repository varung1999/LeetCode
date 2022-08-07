class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = 1;
        suf[n-1]=1;
        
        for(int i =1;i<n;i++)
        {
            pre[i] = pre[i-1]*nums[i-1];
        }
        
        for(int i =n-2;i>=0;i--)
        {
            suf[i]=nums[i+1]*suf[i+1];
        }
        
        int[] result = new int[n];
        for(int i =0;i<n;i++)
        {
            result[i] = pre[i]*suf[i];
        }
        
        return result;
    }
}