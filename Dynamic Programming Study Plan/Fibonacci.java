import java.util.*;
public class FibonacciNumber {
	
  /*
  Recursive Solution.
  Time Complexity : O(2^n)
  Space Complexity: O(n)
  */
  
	public static int fibonacci_rec(int n) 
	{
		if(n<=1)
		{
			return n;
		}
		
		int f1 = fibonacci_rec(n-1);
		int f2 = fibonacci_rec(n-2);
		
		return f1+f2;
	}
  
  /*
    Tabulation Solution.
    Time Complexity : O(n)
    Space Complexity : O(n)
  */
	
	public static int fibonacci_memo(int n)
	{
		int dp[] = new int[n+1];
		
		Arrays.fill(dp, -1);
		
		dp[0]=0;
		dp[1]=1;
		
		for(int i=2;i<=n;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}

	public static void main(String[] args) {
		int ans = fibonacci_rec(4);
		System.out.println(ans);
		
		int ans2 = fibonacci_memo(4);
		System.out.println(ans2);
	}

}
