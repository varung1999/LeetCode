package practice;

public class SortArrayByParityII {
	
	public static int[] sortArrayByParityII(int[] nums) {
		int n = nums.length;
		int ans[] = new int[n];
		int j =0,k=1;
		for(int i =0;i<nums.length;i++)
		{
			if(nums[i]%2==0)
			{
				ans[j]=nums[i];
				j+=2;
			}
			else
			{
				ans[k]=nums[i];
				k+=2;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {4,2,5,7};
		int ans[] = sortArrayByParityII(arr);
		for(int i :ans)
		{
			System.out.print(i+" ");
		}

	}

}
