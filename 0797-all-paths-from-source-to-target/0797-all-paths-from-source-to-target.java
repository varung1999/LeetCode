class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        result = new ArrayList<>();
        if(graph == null || graph.length == 0) return result;
        
        int n = graph.length;
        List<List<Integer>> map = new ArrayList<>();
        
        for(int i =0;i<n;i++)
        {
            List<Integer> row = new ArrayList<>();
            
            for(int j=0;j<graph[i].length;j++)
            {
                row.add(graph[i][j]);
            }
            map.add(row);
        }
        
        dfs(map,0,new ArrayList<>(), new boolean[n]);
        
        return result;
    }
    
    private void dfs(List<List<Integer>> map, int curr, ArrayList<Integer> path, boolean[] visited)
    {
        //base
        path.add(curr);
        if(curr == visited.length - 1)
        {
            
            result.add(new ArrayList<>(path));
            return;
        }
        
        //logic
        for(int child: map.get(curr))
        {
            if(!visited[child])
            {
                visited[child] = true;
                dfs(map,child,path,visited);
                visited[child] = false;
                path.remove(path.size()-1);
            }
            
            
        }
    }
}