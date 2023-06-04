class Solution {
    public int findCircleNum(int[][] isConnected) {
        if(isConnected == null || isConnected.length == 0) return 0;
        
        int n = isConnected.length;
        int count = 0;
        
        boolean visited[] = new boolean[n];
        
        for(int i = 0;i<n;i++)
        {
            if(!visited[i])
            {
                count++;
                dfs(i,isConnected,visited);
            }
        }
        
        return count;
    }
    
    private void dfs(int curr,int[][] isConnected,boolean[] visited)
    {
        visited[curr] = true;
        for(int i = 0;i<isConnected.length;i++)
        {
            if(isConnected[curr][i] == 1 && !visited[i])
            {
                dfs(i,isConnected,visited);
            }
        }
    }
}