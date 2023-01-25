class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        if(edges == null || edges.length == 0) return 0;
        
        int[] dist1 = helper(edges,node1);
        int[] dist2 = helper(edges,node2);
        
        int min = Integer.MAX_VALUE;
        int result = -1;
        
        for(int i=0;i<edges.length;i++)
        {
            if(dist1[i] == -1 || dist2[i] == -1) continue;
            
            int dist = Math.max(dist1[i],dist2[i]);
            
            if(dist<min)
            {
                result = i;
                min = dist;
            }
        }
        
        return result;
        
    }
    
    private int[] helper(int[] edges, int node)
    {
        int[] distance = new int[edges.length];
        Arrays.fill(distance,-1);
        
        int dist = 0;
        while(node!=-1 && distance[node] == -1)
        {
            distance[node] = dist++;
            node = edges[node];
        }
        
        return distance;
    }
}