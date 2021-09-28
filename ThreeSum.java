import java.util.*;

public class ThreeSum {
	
	public static List<List<Integer>> threeSum(int[] nums)
	{
		if(nums.length<3)
		{
			return null;
		}
		Arrays.sort(nums); //-4 -1 -1 0 1 2 
		int n = nums.length;
		
		HashSet<List<Integer>> output = new HashSet<>();
		
		for(int i =0;i<n-2;i++)
		{
			int left = i+1;
			int right = n-1;
			
			while(left<right)
			{
				int currentSum = nums[i] + nums[left] + nums[right];
				
				if(currentSum == 0 )
				{
					output.add(new ArrayList<>(Arrays.asList(nums[i],nums[left++],nums[right--])));
				}
				else if ( currentSum<0)
				{
					left++;
				}
				else
				{
					right--;
				}
			}
		}
			
		
		return new ArrayList<>(output);
	}

	public static void main(String[] args) {
		int nums[] = {-1,0,1,2,-1,-4};
		List<List<Integer>> ans = threeSum(nums);
		for(List<Integer> i : ans)
		{
			System.out.println(i);
		}

	}

}
