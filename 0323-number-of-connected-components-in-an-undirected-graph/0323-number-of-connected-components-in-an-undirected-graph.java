class Solution {
    public int countComponents(int n, int[][] edges) {
        //if(edges == null || edges.length == 0) return 1;
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        
        for(int[] edge: edges)
        {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i = 0;i<n;i++)
        {
            if(!visited[i])
            {
                count++;
                dfs(i,visited,list);
            }
        }
        
        return count;
    }
    
    private void dfs(int curr,boolean[] visited, ArrayList<ArrayList<Integer>> list)
    {
        visited[curr] = true;
        
        for(int child : list.get(curr))
        {
            if(!visited[child])
            {
                dfs(child,visited,list);
            }
        }
    }
}