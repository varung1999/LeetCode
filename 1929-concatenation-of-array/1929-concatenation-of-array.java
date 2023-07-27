class Solution {
    public int[] getConcatenation(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
        
        int n = nums.length;
        int[] ans = new int[n*2];
        
        for(int i = 0;i<ans.length;i++)
        {
            ans[i] = nums[i%n];
        }
        
        return ans;
    }
}