class Solution {
    public int minimumSemesters(int n, int[][] relations) {
        int[] inCount = new int[n+1];
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<n+1;i++)
        {
            graph.add(new ArrayList<>());
        }
        
        for(int[] relation: relations)
        {
            graph.get(relation[0]).add(relation[1]);
            inCount[relation[1]]++;
        }
        System.out.println(graph);
        int step = 0;
        int studiedCount = 0;
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1;i<n+1;i++)
        {
            if(inCount[i] == 0) q.add(i);
        }
        
        while(!q.isEmpty())
        {
            step++;
            int size = q.size();
            
            for(int i = 0;i<size;i++){
                int curr = q.poll();

                studiedCount++;

                for(int endNode:graph.get(curr))
                {
                    inCount[endNode]--;

                    if(inCount[endNode]==0) q.add(endNode);
                }
            }
        }
        
        return studiedCount == n ? step: -1;
    }
}