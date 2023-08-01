class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if(envelopes == null || envelopes.length == 0) return 0;
        int n = envelopes.length;
        Arrays.sort(envelopes, new Comparator<int[]>(){
           public int compare(int[] a, int[] b)
           {
               return a[0]  == b[0] ? b[1] - a[1] : a[0] - b[0];
           }
        });
        
        
        int[] dp = new int[n];
        dp[0] = envelopes[0][1];
        int len = 1;
        
        for(int i = 1;i<n;i++)
        {
            if(envelopes[i][1]>dp[len-1])
            {
                dp[len] = envelopes[i][1];
                len++;
            }
            else{
                int index = binarySearch(dp,0,len - 1, envelopes[i][1]);
                dp[index] = envelopes[i][1];
            }
        }
        return len;
    }
    
    private int binarySearch(int[] dp, int low, int high, int target)
    {
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            
            if(dp[mid] == target) return mid;
            else if(dp[mid]<target) low = mid + 1;
            else high = mid - 1;
        }
        
        return low;
    }
}