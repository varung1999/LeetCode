class Solution {
    public boolean isBipartite(int[][] graph) {
        if(graph == null || graph.length == 0) return true;
        
        int n = graph.length;
        int[] color = new int[n];
        
        for(int i = 0;i<n;i++)
        {
            if(color[i]!=0) continue;
            
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            color[i] = 1;
            
            while(!q.isEmpty())
            {
                int curr = q.poll();
                
                for(int child: graph[curr])
                {
                    if(color[child] == 0) {
                        q.add(child);
                        color[child] = - color[curr];
                    }
                    
                    else if(color[child]!= - color[curr]) return false;
                }
            }
        }
        
        return true;
    }
}