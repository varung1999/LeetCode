class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for(int i =0;i<=n;i++)
        {
            graph.add(new ArrayList<>());
        }
        
        for(int[] dis : dislikes)
        {
            graph.get(dis[0]).add(dis[1]);
            graph.get(dis[1]).add(dis[0]);
        }
        
        int[] colors = new int[n+1];
        Arrays.fill(colors,-1);
        
        for(int i =0;i<=n;i++)
        {
            if(colors[i]==-1)
            {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                
                colors[i] = 1;
                
                while(!q.isEmpty())
                {
                    int curr = q.poll();
                    
                    for(int g: graph.get(curr))
                    {
                        if(colors[g] == -1)
                        {
                            colors[g] = 1 - colors[curr];
                            q.add(g);
                        }
                        else if(colors[g]  == colors[curr])
                        {
                            return false;
                        }
                    }
                }
            }
        }
        
        return true;
    }
}