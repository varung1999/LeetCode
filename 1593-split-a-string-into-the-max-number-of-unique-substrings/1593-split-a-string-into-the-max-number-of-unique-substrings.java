class Solution {
    HashSet<String> set;
    int max = 0;
    public int maxUniqueSplit(String s) {
        if(s == null || s.length() == 0) return 0;
        
        set = new HashSet<>();
        
        dfs(s,0);
        
        return max;
    }
    
    private void dfs(String s, int index)
    {
        //base
        if(index == s.length()){
            max = Math.max(max,set.size());
            return;
        }
        
        //logic
        for(int i = index+1;i<=s.length();i++)
        {
            if(!set.contains(s.substring(index,i))){
                set.add(s.substring(index,i));
                dfs(s,i);
                set.remove(s.substring(index,i));
            }
        }
    }
}