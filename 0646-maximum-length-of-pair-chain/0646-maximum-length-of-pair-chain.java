class Solution {
    public int findLongestChain(int[][] pairs) {
        if(pairs == null || pairs.length == 0) return 0;
        
        Arrays.sort(pairs, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });
        
        int[] dp = new int[pairs.length];
        Arrays.fill(dp,1);
        for(int i = 1;i<pairs.length;i++)
        {
            for(int j = 0;j<i;j++)
            {
                if(pairs[j][1]<pairs[i][0]) dp[i] = Math.max(dp[i],dp[j] + 1);
            }
        }
        
        int max = 1;
        
        for(int i:dp) max = Math.max(max,i);
        
        return max;
    }
}