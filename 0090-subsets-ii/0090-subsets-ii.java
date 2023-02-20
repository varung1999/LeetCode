class Solution {
    List<List<Integer>> result;
    HashSet<List<Integer>> visited;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        result = new ArrayList<>();
        visited = new HashSet<>();
        Arrays.sort(nums);
        if(nums == null || nums.length == 0) return result;
        
        dfs(nums,0,new ArrayList<>());
        
        return result;
    }
    
    private void dfs(int[] nums, int index, ArrayList<Integer> path)
    {
        //base
        if(index == nums.length)
        {
            if(!visited.contains(path))
            {
                result.add(new ArrayList<>(path));
            }
            
            visited.add(new ArrayList<>(path));
            return;
        }
        
        //logic
        dfs(nums,index+1,path);
        path.add(nums[index]);
        dfs(nums,index+1,path);
        path.remove(path.size()-1);
    }
}