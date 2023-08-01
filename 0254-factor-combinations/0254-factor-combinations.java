class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> getFactors(int n) {
        result = new ArrayList<>();
        if(n == 0 || n == 1) return result;
        
        dfs(n,2,new ArrayList<>());
        
        return result;
    }
    
    private void dfs(int n, int currNum, ArrayList<Integer> path)
    {
        //base
        if(n <= 1){
            if(path.size()>1) result.add(new ArrayList<>(path));
            return;
        }
        
        //logic
        
        for(int i = currNum;i<=n;++i)
        {
            if(n%i == 0) {
                path.add(i);
                dfs(n/i,i,path);
                path.remove(path.size()-1);
            }
        }
    }
}