class Solution {
    List<List<String>> result;
    public List<List<String>> partition(String s) {
        result = new ArrayList<>();
        if(s == null || s.length() == 0) return result;
        
        dfs(s,0,new ArrayList<>());
        
        return result;
    }
    
    private void dfs(String s, int index, ArrayList<String> path)
    {
        //base
        if(index >= s.length())
        {
            result.add(new ArrayList<>(path));
            return;
        }
        
        //logic
        for(int i = index;i<s.length();i++)
        {
            
            if(isPalindrome(s,index,i))
            {
                path.add(s.substring(index,i+1));
                dfs(s,i+1,path);
                path.remove(path.size()-1);
            }
            
        }
    }
    
    private boolean isPalindrome(String temp,int i,int j)
    {
        if(i==j) return true;
        while(i<j)
        {
            if(temp.charAt(i)!=temp.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}