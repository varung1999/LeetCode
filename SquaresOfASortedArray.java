package practice;

import java.util.Arrays;

public class SortedSquares {

	public static int[] sortedSquares(int[] nums) {
		
		int n = nums.length;
		int ans[] = new int[n];
		int j=n-1;
		int k =j;
		int i =0;
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

	public static void main(String[] args) {
		int arr[] = {-4,-1,0,3,10};
		int ans[] = sortedSquares(arr);
		for(int i:ans)
		{
			System.out.print(i+" ");
		}

	}

}
