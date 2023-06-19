class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;
        
        dfs(nums,new ArrayList<>(),new boolean[nums.length]);
        
        return result;
    }
    
    private void dfs(int[] nums, ArrayList<Integer> path, boolean[] visited)
    {
        //base
        if(path.size()==nums.length)
        {
            result.add(new ArrayList<>(path));
            return;
        }
        
        //logic
        for(int i = 0;i<nums.length;i++)
        {
            if(!visited[i])
            {
                visited[i] = true;
                path.add(nums[i]);
                dfs(nums,path,visited);
                path.remove(path.size()-1);
                visited[i] = false;
            }
        }

    }
}