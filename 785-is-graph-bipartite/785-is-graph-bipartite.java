class Solution {
    public boolean isBipartite(int[][] graph) {
        if(graph == null || graph.length == 0) return false;
        
        int[] colors = new int[graph.length];
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i =0;i<graph.length;i++)
        {
            if(colors[i]==0){
            q.add(i);
            colors[i]=1;
            
            
            while(!q.isEmpty())
            {
                int curr = q.poll();
                for(int x: graph[curr])
                {
                    if(colors[x] == 0)
                    {
                        colors[x] = -colors[curr];
                        q.add(x);
                    }
                    else if(colors[x] != -colors[curr]) return false;
                }
            }
        }
        }
        
        return true;
    }
}