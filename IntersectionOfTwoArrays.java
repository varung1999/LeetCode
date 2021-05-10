import java.util.*;
class Solution {
   public static int[] intersection(int[] nums1, int[] nums2) {
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i =0;i<nums2.length;i++)
		{
			for(int j=0;j<nums1.length;j++ )
			{
				if(nums2[i]==nums1[j] && isPresent(ans,nums2[i])==false)
				{
					ans.add(nums2[i]);
				}
			}
		}
		
         int[] arr = ans.stream().mapToInt(i -> i).toArray();
       return arr;
	}
	
	public static boolean isPresent(ArrayList<Integer> nums, int key)
	{
		for(int i =0;i<nums.size();i++)
		{
			if(nums.get(i)==key)
			{
				return true;
			}
		}
		return false;
	}
}
