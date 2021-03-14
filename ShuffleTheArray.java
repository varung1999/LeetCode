class Solution {
   public static int[] shuffle(int[] nums, int n) {
		
		
		int first[] = new int[n];
		int second[] = new int[n];
		
		for(int i=0;i<n;i++)
		{	
			first[i]=nums[i];
		}
		int b = nums.length/2;
		
		for(int i=b;i<nums.length;i++)
		{
			second[i-b]=nums[i];
		}
		
		int a=0,x=0,c=0;
		while(c<nums.length)
		{
			nums[c]=first[a];
			c++;a++;
			nums[c]=second[x];
			c++;x++;
		}
       return nums;
   }
}
