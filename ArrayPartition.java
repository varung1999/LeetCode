package practice;

import java.util.Arrays;

public class ArrayPartition {

	public static int arrayPairSum(int[] nums) {
		
		Arrays.sort(nums); // 1 2 3 4
		int n = nums.length;
		int ans= 0;
		for(int i = 1;i<n;i+=2)
		{
			int min = Math.min(nums[i], nums[i-1]);
			ans+=min;
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {6,2,6,5,1,2};
		int ans = arrayPairSum(arr);
		System.out.println(ans);

	}

}
