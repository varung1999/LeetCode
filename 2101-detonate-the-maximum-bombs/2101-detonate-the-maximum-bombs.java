class Solution {
    int count = 0;
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        int ans = 0;
        
        for(int i =0;i<bombs.length;i++)
        {
            count  = 0;
            dfs(i, new boolean[n],bombs);
            ans = Math.max(count,ans);
        }
        
        return ans;
    }
    
    private void dfs(int index, boolean[] visited, int[][] bombs)
    {
        count++;
        visited[index] = true;
        for(int i=0;i<bombs.length;i++)
        {
            if(!visited[i] && helper(bombs[index],bombs[i]))
            {
                visited[i] = true;
                dfs(i,visited,bombs);
            }
        }
    }
    
    private boolean helper(int[] a, int[] b)
    {
        long x = a[0]-b[0];
        long y = a[1] - b[1];
        long r = a[2];
        
        long dist = x*x + y*y;
        
        return dist<=r*r;
    }
}