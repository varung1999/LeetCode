package practice;

public class ClimbStairs {

	public static int climbStairs(int n) {
		
		if(n==0 || n==1)
		{
			return n;
		}
		
		int dp[] = new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i = 2;i<=n;i++)
		{
			int current = dp[i-1]+dp[i-2];
			dp[i]=current;
		}
		
		return dp[n];
	}

	public static void main(String[] args) {
		System.out.println(climbStairs(2));

	}

}
