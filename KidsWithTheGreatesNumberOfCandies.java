class Solution {
   public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		
		int[] add = new int[candies.length];
		for(int i =0;i<candies.length;i++)
		{
			add[i]=candies[i]+extraCandies;
		}
		List<Boolean> ans = new ArrayList<>();
		for(int i=0;i<add.length;i++)
		{
			ans.add(i,true);
		}
		
		for(int i =0;i<add.length;i++)
		{
			for(int j =0;j<candies.length;j++)
			{
				if(add[i]>=candies[j])
				{
					continue;
				}
				else if(add[i]<candies[j])
				{
					ans.set(i,false);
					break;
				}
			}
		}
		return ans;
	}
}

/* better solution: 0ms runtime
  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		

		List<Boolean> ans = new ArrayList<>();
		int max = candies[0];
       for(int i =0;i<candies.length;i++)
       {
           if(candies[i]>max)
           {
               max=candies[i];
           }
       }
       
       for(int i =0;i<candies.length;i++)
       {
           if(candies[i]+extraCandies>=max)
           {
               ans.add(true);
           }
           else
           {
               ans.add(false);
           }
       }
       return ans;
	}
} */
