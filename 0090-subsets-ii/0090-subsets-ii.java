class Solution {
    List<List<Integer>> result;
    //HashSet<List<Integer>> visited;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
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
            if(i!=index && nums[i]==nums[i-1]) continue;
            
            path.add(nums[i]);
            dfs(nums,i+1,path);
            path.remove(path.size()-1);
        }
    }
}