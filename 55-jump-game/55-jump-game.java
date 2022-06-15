class Solution {
    
    HashSet<Integer> visited;
    
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length<2) return true;
        
        Queue<Integer> q = new LinkedList<>();
        visited = new HashSet<>();
        
        q.add(0);
        visited.add(0);
        
        //BFS
        
        while(!q.isEmpty())
        {
            int curr = q.poll();
            
            for(int i = 1;i<=nums[curr];i++)
            {
                int idx = i + curr;
                
                if(idx == nums.length - 1) return true;
                if(!visited.contains(idx)) {
                    q.add(idx);
                    visited.add(idx);
                }
            }
        }
        
        return false;
    }
}