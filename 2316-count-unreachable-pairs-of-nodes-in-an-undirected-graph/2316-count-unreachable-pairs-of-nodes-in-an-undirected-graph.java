class Solution {
    public long countPairs(int n, int[][] edges) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        
        for(int[] edge: edges)
        {
            map.computeIfAbsent(edge[0],k-> new ArrayList<Integer>()).add(edge[1]);
            map.computeIfAbsent(edge[1],k->new ArrayList<Integer>()).add(edge[0]);
        }
        
        long numPairs = 0, size = 0,remaining = n;
        boolean[] visited = new boolean[n];
        
        for(int i  = 0;i<n;i++)
        {
            if(!visited[i])
            {
                size = dfs(i,map,visited);
                numPairs += size * (remaining - size);
                remaining -=size;
            }
        }
        
        return numPairs;
    }
    
    private int dfs(int node, Map<Integer,List<Integer>> map, boolean[] visited)
    {
        int count = 1;
        visited[node] = true;
        
        if(!map.containsKey(node)) return count;
        
        for(int neighbor: map.get(node))
        {
            if(!visited[neighbor]){
                count += dfs(neighbor,map,visited);
            }
        }
        
        return count;
    }
}