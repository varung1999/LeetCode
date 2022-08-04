class Solution {
    boolean flag;
    ArrayList<ArrayList<Integer>> adjList;
    boolean visited[];
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges==null || edges.length == 0) return true;
        
        adjList = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adjList.add(i,new ArrayList<>());
        }
        
        for(int i =0;i<edges.length;i++)
        {
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }
        
        flag = false;
        visited = new boolean[n];
        
        dfs(source,destination);
        return flag;
    }
    
    private void dfs(int start, int end)
    {
        if(visited[start] == true || flag == true)
        {
            return;
        }
        visited[start] = true;
        for(int edges: adjList.get(start))
        {
            if(edges == end)
            {
                flag = true;
                break;
            }
            
            if(visited[edges]==false)
            {
                dfs(edges,end);
            }
            
    
        }
    }
    
    
}