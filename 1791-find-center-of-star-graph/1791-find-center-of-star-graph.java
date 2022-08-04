class Solution {
    public int findCenter(int[][] edges) {
        if(edges == null || edges.length == 0) return 0;
        
        int n = edges.length;
        int[] indegrees = new int[n+1];
        for(int[] edge: edges)
        {
            indegrees[edge[0]-1]++;
            indegrees[edge[1]-1]++;
        }
        
        for(int i =0;i<=n;i++)
        {
            if(indegrees[i]==n)
            {
                return i+1;
            }
        }
        
        return -1;
    }
}