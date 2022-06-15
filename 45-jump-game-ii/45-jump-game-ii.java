class Solution {
    public int jump(int[] nums) {
        if(nums == null || nums.length < 2) return 0;
        
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        
        q.add(0);
        visited.add(0);
        
        int level = 0;
        
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i = 0;i<size;i++)
            {
                int curr = q.poll();
                
                for(int j = 1;j<=nums[curr];j++)
                {
                    int idx = j + curr;
                    
                    if(idx >= nums.length - 1) return level + 1;
                    
                    if(!visited.contains(idx))
                    {
                        visited.add(idx);
                        q.add(idx);
                    }
                }
            }
            level++;
        }
        
        return -1;
    }
}