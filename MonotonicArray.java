package practice;

public class MonotonicArray {

	 public static boolean isMonotonic(int[] nums) {
	        
	        int n = nums.length;
	        
			if(n>1 && nums[0]==nums[1])
			{
				return positive(nums) || negative(nums);
			}
			else if(n>1 && nums[0]<=nums[1])
			{
				return positive(nums);
			}
			else if(n>1 && nums[0]>=nums[1])
			{
				return negative(nums);
			}
			else
			{
				return true;
			}

		}


	public static boolean positive(int nums[])
	{
		int n = nums.length;// 1 2 4 5 
		for(int i = 1;i<n-1;i++)
		{
			if(nums[i]<=nums[i+1])
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

	public static boolean negative(int nums[])
	{
		int n = nums.length;
		for(int i = 1;i<n-1;i++)
		{
			if(nums[i]>=nums[i+1])
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
		int arr[]= {1,1,0};
		boolean ans = isMonotonic(arr);
		System.out.println(ans);

	}

}
