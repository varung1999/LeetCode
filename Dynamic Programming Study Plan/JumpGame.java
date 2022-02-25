/*
  Iterative Solution
  Time Complexity: O(n)

  The key idea is to travel from back of the array and check if we can reach to the front.

*/
class Solution {
    public boolean canJump(int[] nums) {
        
        
        int lastGoodIndex = nums.length -1;
        
        for(int i = lastGoodIndex;i>=0;i--)
        {
            if(i+ nums[i]>=lastGoodIndex)
            {
                lastGoodIndex = i;
            }
        }
        
        return lastGoodIndex ==0;
    }
}


/*
  Dynamic Programming Solution
  
  Time Complexity:: O(n^2)

*/

class Solution {
    public boolean canJump(int[] nums) {
     
        
        boolean dp[] = new boolean[nums.length];
        
        dp[nums.length-1]=true;
        
        for(int i = nums.length-2;i>=0;i--)
        {
            for(int k=0;k<=nums[i];k++)
            {
                if(dp[i+k]==true)
                {
                    dp[i]=true;
                    break;
                }
            }
        }
        
        return dp[0];
    }
}
