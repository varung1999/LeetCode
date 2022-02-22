class Solution {
  
  /* DP Solution : Tabulation Method 
     Time Complexity : O(n)
     Space Complexity : O(n)
     
     */
  
    public int tribonacci(int n) {
        
        if(n<=1)
        {
            return n;
        }
        if(n==2)
        {
            return 1;
        }
        
        int dp[] = new int[n+1];
        
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        
        
        for(int i = 3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        
        return dp[n];
    }
  /*
  Recursive Solution
Time Complexity : O(3^n)
Space Complexity : O(n) - call stack
  */
  public static int tribonacci_rec(int n)
  {
    if(n<=1)
    {
      return 1;
    }
    
    if(n==2)
    {
      return 1;
    }
    
    int t1 = tribonacci_rec(n-1);
    int t2 = tribonacci_rec(n-2);
    int t3 = tribonacci_rec(n-3);
    
    return t1+t2+t3;
  }
    
}
