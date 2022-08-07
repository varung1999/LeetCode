class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int max = Integer.MIN_VALUE;
        for(int i:nums)
        {
            max = Math.max(i,max);
        }
        
        int[] temp = new int[max+1];
        
        for(int i:nums)
        {
            temp[i]+=i;
        }
        
        int skip = 0, take = temp[0];
        for(int i=1;i<temp.length;i++)
        {
            int x = skip;
            skip = Math.max(skip,take);
            take = x + temp[i]; 
        }
        
        return Math.max(skip,take);
    }
}