class Solution {
    public boolean validTree(int n, int[][] edges) {
        //if(edges == null || edges.length == 0) return true;
        List<List<Integer>> adjList = new ArrayList<>();
        
        for(int i = 0;i<n;i++)
        {
            adjList.add(new ArrayList<>());
        }
        
        for(int[] edge : edges)
        {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        
        while(!q.isEmpty())
        {
            int curr = q.poll();
            
            for(int child : adjList.get(curr))
            {
                if(map.get(curr) == child) continue;
                if(map.containsKey(child)) return false;
                
                q.add(child);
                map.put(child,curr);
            }
        }
        System.out.println(map);
        return map.size() == n;
    }
}