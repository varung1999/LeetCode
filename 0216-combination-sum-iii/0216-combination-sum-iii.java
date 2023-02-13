class Solution {
    List<List<Integer>> result;
    int[] nums = {1,2,3,4,5,6,7,8,9};
    public List<List<Integer>> combinationSum3(int k, int n) {
        result = new ArrayList<>();
        
        dfs(k,n,0,new ArrayList<>());
        
        return result;
    }
    
    private void dfs(int k,int target, int index, ArrayList<Integer> path)
    {
        //base
        if(target == 0 && path.size() == k)
        {
            result.add(new ArrayList<>(path));
            return;
        }
        
        if(target<0 || path.size() == k) return;
        
        //logic
        for(int i = index;i<nums.length;i++)
        {
            path.add(nums[i]);
            dfs(k,target - nums[i],i+1,path);
            path.remove(path.size()-1);
        }
    }
}