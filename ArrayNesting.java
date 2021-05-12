package practice;
import java.util.*;

public class ArrayNesting {

	public static int arrayNesting(int[] nums) {
		
		int max = Integer.MIN_VALUE;
		boolean visited[] = new boolean[nums.length];
		
		for(int i:nums)
		{
			int count = 0;
			
			while(visited[i]==false)
			{
				count++;
				visited[i]=true;
				i=nums[i];
			}
			max= Math.max(max, count);
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[]= {0,2,1};
		int ans = arrayNesting(arr);
		System.out.println(ans);
	}

}
