class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        if(nums == null || queries == null || nums.length == 0 || queries.length == 0) return new int[]{};
        
        int sum = 0;
        for(int i:nums)
        {
            if(i%2==0)sum+=i;
        }
        
        int[] ans = new int[queries.length];
        for(int i =0;i<queries.length;i++)
        {
            int index = queries[i][1];
            int value = queries[i][0];
            
            if(nums[index]%2==0) sum-=nums[index];
            nums[index]+=value;
            if(nums[index]%2==0) sum+=nums[index];
            ans[i]=sum;
        }
        
        return ans;
    }
}