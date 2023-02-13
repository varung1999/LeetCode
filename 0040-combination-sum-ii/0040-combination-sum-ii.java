class Solution {
    HashSet<List<Integer>> set; 
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        set = new HashSet<>();
        result = new ArrayList<>();
        Arrays.sort(candidates);
        if(candidates == null || candidates.length == 0) return result;
        
        dfs(candidates,target,0,new ArrayList<>());
        
        return result;
    }
    
    private void dfs(int[] candidates, int target, int index, ArrayList<Integer> path)
    {
        //base
        if(target == 0)
        {
            if(!set.contains(path))
            {
                set.add(new ArrayList<>(path));
                result.add(new ArrayList<>(path));
            }
            return;
        }
        
        if(target<0) return;
        
        //logic
        for(int i = index;i<candidates.length;i++)
        {
            if(i>index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i]>target) break;
            path.add(candidates[i]);
            dfs(candidates,target - candidates[i],i+1,path);
            path.remove(path.size()-1);
        }
    }
}