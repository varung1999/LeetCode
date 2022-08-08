class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = 1;
        
        
        for(int i =1;i<n;i++)
        {
            pre[i] = pre[i-1]*nums[i-1];
        }
        
        int rp = 1;
        for(int i = n-2;i>=0;i--)
        {
            rp*=nums[i+1];
            pre[i]*=rp;
            
        }
        
        return pre;
    }
}