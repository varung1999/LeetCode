package practice;

public class MergeSortedArray {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int ans[] = new int[n+m];
		
		int i =0;
		int j =0;
		int k =0;
		while((nums1[i]!=0 && nums2[j]!=0)&& (i<m && j<n))
		{
			if(nums1[i]<nums2[j])
			{
				ans[k]=nums1[i];
				i++;
				k++;
			}
			else if(nums1[i]>nums2[j])
			{
				ans[k]=nums2[j];
				k++;
				j++;
			}
			else 
			{
				ans[k]=nums1[i];
				k++;
				i++;
				ans[k]=nums2[j];
				k++;
				j++;				
			}
		}
		
		while(i<nums1.length && nums1[i]!=0)
		{
			ans[k]=nums1[i];
			k++;
			i++;
		}
		while(j<nums2.length && nums2[j]!=0)
		{
			ans[k]=nums2[j];
			k++;
			j++;
		}
		
		for(int l:ans)
		{
			System.out.print(l+" ");
		}
	}

	public static void main(String[] args) {
		int arr1[] = {1,2,3,0,0,0};
		int arr2[] = {2,5,6};
		int n = 3;
		int m = 3;
		
		merge(arr1, m, arr2, n);

	}

}
