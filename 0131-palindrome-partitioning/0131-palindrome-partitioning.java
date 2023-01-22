class Solution {
    List<List<String>> result;
    public List<List<String>> partition(String s) {
        result = new ArrayList<>();
        if(s == null || s.length() == 0) return result;
        
        dfs(s,0,new ArrayList<>());
        
        return result;
    }
    
    private void dfs(String s, int index, ArrayList<String> temp)
    {
        //base
        if(index==s.length())
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        //logic
        for(int i = index;i<s.length();i++)
        {
            if(isPalindrome(s,index,i))
            {
                temp.add(s.substring(index,i+1));
                dfs(s,i+1,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    
    private boolean isPalindrome(String s, int start, int end)
    {
        if(start == end) return true;
        
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}