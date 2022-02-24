class Solution {
    public int rob(int[] nums) {
        
        
        //Dynamic Programming Solution
        
        if(nums.length==0)
        {
            return 0;
        }
        
        if(nums.length==1)
        {
            return nums[0];
        }
        
        if(nums.length==2)
        {
            return Math.max(nums[0],nums[1]);
        }
        
        int dp[] = new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        
        for(int i = 2;i<nums.length;i++)
        {
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        
        return dp[nums.length-1];
    }
}


//Iterative Solution

class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==0)
        {
            return 0;
        }
        
        if(nums.length==1)
        {
            return nums[0];
        }
        
        if(nums.length==2)
        {
            return Math.max(nums[0],nums[1]);
        }
        
        return helper(nums,0,nums.length);
    }
    
    public static int helper(int[] nums,int start,int end)
    {
        int prevTwo = 0,prevOne=0,max=0;
        
        for(int i = start;i<end;i++)
        {
            max = Math.max(prevTwo+nums[i],prevOne);
            prevTwo = prevOne;
            prevOne =max;
        }
        
        return max;
        
        
    }
}
