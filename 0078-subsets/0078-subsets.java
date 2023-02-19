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
        if(index==nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        
        //logic
        dfs(nums,index+1,path);
        path.add(nums[index]);
        dfs(nums,index+1,path);
        path.remove(path.size()-1);
    }
}