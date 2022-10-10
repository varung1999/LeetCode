class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 0) return 0;
        
        int[] outdegrees = new int[n+1];
        
        for(int[] temp : trust)
        {
            outdegrees[temp[0]]--;
            outdegrees[temp[1]]++;
        }
        
        for(int i=1;i<=n;i++)
        {
            if(outdegrees[i]==n-1)
            {
                return i;
            }
        }
        
        return -1;
    }
}