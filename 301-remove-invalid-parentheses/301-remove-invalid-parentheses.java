class Solution {
    HashSet<String> set;
    List<String> result;
    public List<String> removeInvalidParentheses(String s) {
        
        if(s == null || s.length()==0) return new ArrayList<>();
        set = new HashSet<>();
        result = new ArrayList<>();
        
        Queue<String> q = new LinkedList<>();
        boolean found = false;
        
        q.add(s);
        set.add(s);
        while(!q.isEmpty() )
        {
            int size = q.size();
            
            
                String curr = q.poll();
                
                if(isValid(curr))
                {
                    
                        set.add(curr);
                        result.add(curr);
                        found = true;
                    
                }
                else
                {
                    if(found == false)
                    {
                        for(int j =0;j<curr.length();j++)
                        {
                            if(Character.isLetter(curr.charAt(j))) continue;
                            String child = curr.substring(0,j) + curr.substring(j+1);
                            if(!set.contains(child))
                            {
                                set.add(child);
                                q.add(child);
                            }
                        }
                    }
                }
            
        }
        
        return result;
        
     }
    
    private boolean isValid(String s)
    {
        int count  = 0;
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='(')
            {
                count++;
            }
            else if(c == ')')
            {
                count--;
            }
            if(count<0)
            {
                return false;
            }
        }
        
        return count == 0;
    }
}