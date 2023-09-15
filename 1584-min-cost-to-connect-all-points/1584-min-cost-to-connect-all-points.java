class UnionFind {
    int[] group;
    int[] rank;
    
    public UnionFind(int size)
    {
        group = new int[size];
        rank = new int[size];
        
        for(int i = 0;i<size;i++) group[i] = i;
    }
    
    public int find(int node)
    {
        int root = node;
        
        while(root!=group[root]) root = group[root];
        group[node] = root;
        
        return root;
    }
    
    public boolean union(int node1, int node2)
    {
        int a = find(node1);
        int b = find(node2);
        
        if(a==b) return false;
        
        if(rank[a]>rank[b]) group[b] = a;
        else if(rank[b]>rank[a]) group[a] = b;
        else{
            group[a] = b;
            rank[b] ++;
        }
        
        return true;
    }
}

class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        
        ArrayList<int[]> allEdges = new ArrayList<>();
        
        for(int i = 0;i<n;i++)
        {
            for(int j = i + 1;j<n;j++)
            {
                int weight = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                
                int[] currEdge = {weight,i,j};
                allEdges.add(currEdge);
            }
        }
        
        Collections.sort(allEdges,(a,b)-> a[0] - b[0]);
        
        UnionFind uf = new UnionFind(n);
        int mstCost = 0;
        int edgesUsed = 0;
        
        for(int i = 0;i<allEdges.size() && edgesUsed<n-1;i++)
        {
            int node1 = allEdges.get(i)[1];
            int node2 = allEdges.get(i)[2];
            
            int weight = allEdges.get(i)[0];
            
            if(uf.union(node1,node2))
            {
                mstCost+=weight;
                edgesUsed++;
            }
        }
        
        return mstCost;
    }
}