class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> result = new ArrayList<>();
        int[] visited = new int[n];
        for(List<Integer> e : edges)
        {
            visited[e.get(1)] = 1;
        }
        
        for(int i =0;i<n;i++) 
        {
            if(visited[i]==0) result.add(i);
        }
        
        return result;
    }
}