class UnionFind{
    
    int[] parent;
    int n;
    
    public UnionFind(int n)
    {
        parent = new int[n];
        this.n = n;
        
        for(int i =0;i<n;i++) parent[i] = i;
    }
    
    public void union(int u, int v)
    {
        if(u!=v)
        {
            int a = find(u);
            int b = find(v);
            
            parent[a] = b;
        }
    }
    
    public int find(int u)
    {
        int x = u;
        while(x!=parent[x]) x = parent[x];
        
        parent[u] = x;
        
        return x;
    }
    
    public boolean areConnected(int u, int v)
    {
        return find(u) == find(v);
    }
}

class Solution {
    public int findCircleNum(int[][] isConnected) {
        if(isConnected == null || isConnected.length == 0) return 0;
        
        UnionFind uf = new UnionFind(isConnected.length);
        
        for(int i = 0;i<isConnected.length;i++)
        {
            for(int j = i+1; j<isConnected[i].length;j++)
            {
                
                if(isConnected[i][j] == 1)
                {
                    uf.union(i,j);
                }
            }
        }
        
       int count = 0;
        for(int i = 0;i<uf.parent.length;i++)
        {
            if(uf.parent[i] == i) count++;
        }
        
        return count;
    }
}