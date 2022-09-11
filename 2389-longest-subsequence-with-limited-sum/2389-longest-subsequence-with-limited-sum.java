class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        if(nums == null || queries == null || nums.length == 0 || queries.length == 0) return new int[]{};
        
        int[] ans = new int[queries.length];
        
        Arrays.sort(nums);
        int k = 0;
        for(int i = 0;i<queries.length;i++)
        {
            ans[k++] = helper(nums,queries[i]);
        }
        return ans;
    }
    
    private int helper(int[] nums, int q)
    {
        int count = 0;
        int sum = 0;
        for(int i : nums)
        {
            if(sum+i<=q)
            {
                count++;
            }
            sum = sum + i;
        }
        return count;
    }
}