class Solution {
    List<List<Integer>> result;
    HashSet<List<Integer>> set;
    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        set = new HashSet<>();
        if(n == 0) return result;
        
        dfs(n,k,1,new ArrayList<>());
        
        return result;
    }
    
    private void dfs(int n, int k,int curr, ArrayList<Integer> path)
    {
        //base
        if(path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }
        
        if(curr > n) return;
        
        //logic
       // for(int num = curr;num<=n;num++)
       // {
       //     path.add(num);
       //     dfs(n,k,num+1,path);
       //     path.remove(path.size()-1);
       // }
        
        dfs(n,k,curr+1,path);
        path.add(curr);
        dfs(n,k,curr+1,path);
        path.remove(path.size()-1);
    }
}