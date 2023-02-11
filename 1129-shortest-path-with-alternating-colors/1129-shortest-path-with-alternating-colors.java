class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        Map<Integer,List<List<Integer>>> map = new HashMap<>();
        for(int[] edge : redEdges)
        {
            map.computeIfAbsent(edge[0], k-> new ArrayList<List<Integer>>()).add(Arrays.asList(edge[1],0));
        }
        
        for(int[] edge : blueEdges)
        {
            map.computeIfAbsent(edge[0], k-> new ArrayList<List<Integer>>()).add(Arrays.asList(edge[1],1));
        }
        
        int[] ans = new int[n];
        //System.out.println(map);
        Arrays.fill(ans,-1);
        boolean[][] visited = new boolean[n][2];
        Queue<int[]> q = new LinkedList<>();
        
        q.add(new int[]{0,0,-1});
        ans[0] = 0;
        
        visited[0][1] = visited[0][0] = true;
        
        while(!q.isEmpty())
        {
            int[] curr = q.poll();
            int node = curr[0], steps = curr[1], prevColor = curr[2];
            
            if(!map.containsKey(node)) continue;
            
            for(List<Integer> child : map.get(node))
            {
                int neighbor = child.get(0);
                int color = child.get(1);
                if(!visited[neighbor][color] && color!=prevColor)
                {
                    if(ans[neighbor]==-1) ans[neighbor] = 1 + steps;
                    visited[neighbor][color]=true;
                    q.add(new int[]{neighbor, 1 + steps, color});
                }
            }
        }
        
        return ans;
    }
}