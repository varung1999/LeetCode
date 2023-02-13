class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        if(candidates == null || candidates.length == 0) return result;
        
        dfs(candidates,target,0,new ArrayList<>());
        
        return result;
    }
    
    private void dfs(int[] candidates, int target, int index, ArrayList<Integer> path)
    {
        //base
        if(target == 0)
        {
            result.add(new ArrayList<>(path));
            return;
        }
        if(target<0) return;
        
        //logic
        for(int i = index;i<candidates.length;i++)
        {
            path.add(candidates[i]);
            dfs(candidates,target - candidates[i],i,path);
            path.remove(path.size()-1);
        }
    }
}