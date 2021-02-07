class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int rs[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<=i;j++)
            {
                rs[i]+=nums[j];
            }
        }
        return rs;
    }
}
