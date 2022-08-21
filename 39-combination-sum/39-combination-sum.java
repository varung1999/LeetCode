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
        if(target == 0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(target<0)
        {
            return;
        }
        
        //logic
        for(int i = index;i<candidates.length;i++)
        {
            temp.add(candidates[i]);
            dfs(candidates,i,target - candidates[i],temp);
            temp.remove(temp.size()-1);
        }
    }
}