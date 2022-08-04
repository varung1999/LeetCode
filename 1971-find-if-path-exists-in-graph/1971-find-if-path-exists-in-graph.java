class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges==null || edges.length == 0) return true;
        
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adjList.add(i,new ArrayList<>());
        }
        
        for(int i =0;i<edges.length;i++)
        {
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }
        
        boolean[] visited = new boolean[n];
        
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        //System.out.println("Hello");
        while(!q.isEmpty())
        {
            
            int curr = q.poll();
            visited[curr]= true;
            if(curr == destination){
                //System.out.println("reached");
                return true;
            }
            
            for(int nodes: adjList.get(curr))
            {
                if(visited[nodes] == false)
                {
                    q.add(nodes);
                }
            }
        }
        return false;
    }
    
}