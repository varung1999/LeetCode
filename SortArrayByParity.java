package practice;

public class SortArray {
	public static int[] sortArrayByParity(int[] A) {
		
		int n = A.length;
		int ans[] = new int[n];
		
		int k = n-1;
		int l=0;
		for(int i = 0;i<n;i++)
		{
			if(A[i]%2==0)
			{
				ans[l]=A[i];
				l++;
			}
			else
			{
				ans[k]=A[i];
				k--;
			}
			
		}
		return ans;
		
	}

	public static void main(String[] args) {
		int arr[] = {3,1,2,4};
		int ans[] = sortArrayByParity(arr);
		for(int i:ans)
		{
			System.out.print(i+" ");
		}

	}

}
