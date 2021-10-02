class Solution {
    public int[] sortedSquares(int[] nums) {
        
       int ans[] = new int[nums.length];
        
        int i  =0;
        int j = nums.length-1;
        
        
        int k = j;
        
        while(i<=j)
        {
            int a = Math.abs(nums[i]);
            int b = Math.abs(nums[j]);
            
            if(a>=b)
            {
                ans[k--]=a*a;
                i++;
            }
            else
            {
                ans[k--]=b*b;
                j--;
            }
        }
        return ans;
    }
}
