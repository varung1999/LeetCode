class Solution {
   public static int[] intersect(int[] nums1, int[] nums2) {
		ArrayList<Integer> ans = new ArrayList<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i =0;
		int j =0;
		while(i<nums1.length && j<nums2.length)
		{
			if(nums1[i]>nums2[j])
			{
				j++;
			}
			else if(nums1[i]<nums2[j])
			{
				i++;
			}
			else
			{
				ans.add(nums1[i]);
				i++;
				j++;
			}
		}
		
		int total[] = new int[ans.size()];
		int q = 0;
		for(int k:ans)
		{
			total[q++]=k;
		}
		  
		return total;
	}
}
