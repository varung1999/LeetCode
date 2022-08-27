class Solution {
    List<List<Integer>> result;
    HashMap<Integer,List<Integer>> map;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        result = new ArrayList<>();
        map = new HashMap<>();
        if(graph == null || graph.length == 0) return result;
        
        for(int i =0;i<graph.length;i++)
        {
            map.put(i,new ArrayList<>());
            for(int j=0;j<graph[i].length;j++)
            {
                map.get(i).add(graph[i][j]);
            }
        }
        helper(graph,0,new ArrayList<>());
        
        return result;
    }
    
    private void helper(int[][] graph, int index, ArrayList<Integer> path)
    {
        //base
        if(index == graph.length - 1)
        {
            path.add(index);
            result.add(new ArrayList<>(path));
            return;
        }
        
        //logic
        List<Integer> temp = map.get(index);
        path.add(index);
        for(int nodes: temp)
        {
            //path.add(nodes);
            helper(graph,nodes,path);
            path.remove(path.size()-1);
        }
        
    }
}