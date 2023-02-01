class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //if(prerequisites == null || prerequisites.length == 0) return new int[]{0};
        
        int[] indegrees = new int[numCourses];
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        
        for(int[] pre : prerequisites)
        {
            indegrees[pre[0]]++;
            if(!map.containsKey(pre[1]))
            {
                map.put(pre[1],new ArrayList<>());
            }
            
            map.get(pre[1]).add(pre[0]);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for(int i=0;i<indegrees.length;i++)
        {
            if(indegrees[i]==0) {
                q.add(i);
                result.add(i);
                count++;
            }
        }
        
        // for(int i: indegrees)
        // {
        //     System.out.println(i);
        // }
        
        if(q.isEmpty()) return new int[]{};
        
        while(!q.isEmpty())
        {
            int curr = q.poll();
            
            List<Integer> temp = map.get(curr);
            
            if(temp!=null)
            {
                for(int num : temp)
                {
                    indegrees[num]--;
                    if(indegrees[num]==0)
                    {
                        q.add(num);
                        result.add(num);
                        count++;
                    }
                }
            }
        }
        
        int[] ans = new int[result.size()];
        for(int i =0;i<ans.length;i++)
        {
            ans[i]=result.get(i);
        }
        
        
        if(count == numCourses)return ans;
        
        return new int[0];
    }
}