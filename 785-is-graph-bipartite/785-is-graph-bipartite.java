class Solution {
    public boolean isBipartite(int[][] graph) {
        if(graph == null || graph.length == 0) return false;
        
        int n = graph.length;
        int[] colors = new int[n];
        Arrays.fill(colors,-1);
        
        for(int i =0;i<graph.length;i++)
        {
            if(colors[i]==-1){
                colors[i]=1;
                
                if(!dfs(colors,graph,i))
                {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private boolean dfs(int[] colors, int[][] graph, int curr)
    {
        for(int node: graph[curr])
        {
            if(colors[node] == colors[curr]) return false;
            if(colors[node] == -1)
            {
                colors[node] = 1 - colors[curr];
                
                if(!dfs(colors,graph,node)) return false;
            }
        }
        
        return true;
    }
}