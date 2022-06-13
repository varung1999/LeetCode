class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0) return 0;
        
        int n = triangle.size();
        int[] dp = new int[n+1];
        
        for(int i = n-1;i>=0;i--)
        {
            for(int j = 0;j<triangle.get(i).size();j++)
            {
                dp[j] = Math.min(dp[j],dp[j+1])+triangle.get(i).get(j);
            }
        }
        
        return dp[0];
        
    }
}
