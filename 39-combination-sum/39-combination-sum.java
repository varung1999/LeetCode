class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        if(candidates == null || candidates.length == 0) return result;
        
        dfs(candidates, 0,target,new ArrayList<>());
        
        return result;
    }
    
    private void dfs(int[] candidates, int index, int target, ArrayList<Integer> temp)
    {
        //base
        if(target == 0)
        {
            result.add(temp);
            return;
        }
        
        if(index == candidates.length || target<0)
        {
            return;
        }
        
        //logic
        dfs(candidates, index+1, target,new ArrayList<>(temp));
        temp.add(candidates[index]);
        dfs(candidates,index, target - candidates[index],new ArrayList<>(temp));
    }
}