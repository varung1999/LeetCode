class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int max = Integer.MIN_VALUE;
        for(int i:nums) max = Math.max(i,max);
        
        int[] count = new int[max+1];
        for(int i:nums)
        {
            count[i]+=i;
        }
        
        int skip = 0, take = count[0];
        
        for(int i = 1;i<count.length;i++)
        {
            int temp = skip;
            skip = Math.max(skip,take);
            take = count[i] + temp;
        }
        
        return Math.max(skip,take);
    }
}