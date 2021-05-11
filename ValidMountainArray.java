package practice;

public class MountainArray {

	public static boolean validMountainArray(int[] arr) {
		if(arr.length<3)
		{
			return false;
		}
		int cut=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]<arr[i])
			{
				continue;
			}
			else
			{
				cut=i-1;
				break;
			}
		}
		
		for(int i = cut;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int arr1[] = {2,1};//false
		int arr2[] = {3,5,5};//false
		int arr3[] = {0,3,2,1};//true
		int arr4[] = {0,2,3,4,5,2,1,0};//true
		int arr5[] = {0,1,2,3,4,8,9,10,11,12,11};//true

		boolean ans1=validMountainArray(arr1);
		boolean ans2=validMountainArray(arr2);
		boolean ans3=validMountainArray(arr3);
		boolean ans4=validMountainArray(arr4);
		boolean ans5=validMountainArray(arr5);

		System.out.print(ans1+" "+ans2+" "+ans3+" "+ans4+" "+ans5);

	}

}
