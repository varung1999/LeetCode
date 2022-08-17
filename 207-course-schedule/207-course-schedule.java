class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites == null || prerequisites.length == 0) return true;
        int[] indegrees = new int[numCourses];
        
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        
        for(int[] edge: prerequisites)
        {
            indegrees[edge[0]]++;
            if(!map.containsKey(edge[1]))
            {
                map.put(edge[1],new ArrayList<>());
            }
            
            map.get(edge[1]).add(edge[0]);
        }
        
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indegrees.length;i++)
        {
            if(indegrees[i]==0)
            {
                q.add(i);
                count++;
            }
        }
        
        if(q.isEmpty()) return false;
        
        while(!q.isEmpty())
        {
            int curr = q.poll();
            
            List<Integer> temp = map.get(curr);
            if(temp!=null)
            {
                for(int ed: temp)
                {
                    indegrees[ed]--;
                    if(indegrees[ed]==0)
                    {
                        q.add(ed);
                        count++;
                    }
                }
            }
        }
        
        return count == numCourses;
    }
}