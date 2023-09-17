class Solution {
    
    class Node {
        int visited;
        int dist;
        int node;
        
        public Node(int node, int dist, int visited){
            this.node = node;
            this.dist = dist;
            this.visited = visited;
        }
        
    }
    public int shortestPathLength(int[][] graph) {
        if(graph == null || graph.length == 0) return 0;
        
        int n = graph.length;
        Set<Integer>[] visited = new HashSet[n];
        
        Queue<Node> q = new LinkedList<>();
        
        
        for(int i = 0;i<n;i++)
        {
            visited[i] = new HashSet<>();
            
            q.add(new Node(i,0,1<<i));
            visited[i].add(1<<i);
        }
        
        while(!q.isEmpty())
        {
            Node node = q.poll();
            
            if(node.visited == (1<<n)-1) return node.dist;
            
            for(int child: graph[node.node])
            {
                int mask = node.visited | (1<<child);
                
                if(visited[child].add(mask))
                {
                    q.add(new Node(child,1+node.dist,mask));
                }
            }
        }
        
        return -1;
    }
}