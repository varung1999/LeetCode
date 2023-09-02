class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        if(s == null || s.length() == 0) return 0;
        int n = s.length();
        HashSet<String> set = new HashSet<>(Arrays.asList(dictionary));
        
        int[] dp = new int[n+1];
        //Arrays.fill(dp,-1);
        
        for(int i = n -1 ;i>=0;i--)
        {
            dp[i] = 1 + dp[i+1];
            for(int end = i;end<n;end++)
            {
                String curr = s.substring(i,end+1);
                if(set.contains(curr))
                {
                    dp[i] = Math.min(dp[i],dp[end+1]);
                }
            }
        }
        
        return dp[0];
    }
}