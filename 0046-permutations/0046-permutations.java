class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;
        
        dfs(nums,0,new ArrayList<>(),new boolean[nums.length]);
        
        return result;
    }
    
    private void dfs(int[] nums, int index, ArrayList<Integer> path, boolean[] visited)
    {
        //base
        if(path.size() == nums.length)
        {
            result.add(new ArrayList<>(path));
            return;
        }
        
        //logic
        for(int i = 0;i<nums.length;i++)
        {
            if(!visited[i])
            {
                path.add(nums[i]);
                visited[i] = true;
                dfs(nums,i+1,path,visited);
                visited[i] = false;
                path.remove(path.size()-1);
            }
        }
    }
}