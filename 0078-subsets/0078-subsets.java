class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        
        if(nums == null || nums.length == 0) return result;
        
        dfs(nums,0,new ArrayList<>());
        
        return result;
    }
    
    private void dfs(int[] nums, int index, ArrayList<Integer> path)
    {
        //base
        
        //logic
        result.add(new ArrayList<>(path));
        for(int i = index;i<nums.length;i++)
        {
            //dfs(nums,i+1,path);
            path.add(nums[i]);
            dfs(nums,i+1,path);
            path.remove(path.size()-1);
        }
    }
}