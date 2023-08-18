class Solution {
    List<List<Integer>> adjList;
    public int maximalNetworkRank(int n, int[][] roads) {
        if(roads == null || roads.length == 0) return 0;
        
        adjList = new ArrayList<>();
        
        for(int i = 0;i<n;i++) adjList.add(i, new ArrayList<>());
        for(int[] road:roads)
        {
            adjList.get(road[0]).add(road[1]);
            adjList.get(road[1]).add(road[0]);
        }
        
        int max = 1;
        for(int i = 0;i<adjList.size()-1;i++)
        {
            for(int j = i+1;j<adjList.size();j++)
            {
                int temp = adjList.get(i).size() + adjList.get(j).size();
                
                if(adjList.get(i).contains(j) && adjList.get(j).contains(i)) temp-=1;
                max = Math.max(max,temp);
            }
        }
        return max;
    }
}