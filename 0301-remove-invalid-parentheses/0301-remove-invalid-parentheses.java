class Solution {
    HashSet<String> set;
    Queue<String> q;
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        if(s == null || s.length() == 0) return result;
        
        set = new HashSet<>();
        q = new LinkedList<>();
        
        boolean found = false;
        
        q.add(s);
        set.add(s);
        
        while(!q.isEmpty())
        {
            String curr = q.poll();
            if(isValid(curr))
            {
                result.add(curr);
                found = true;
            }
            else if(found==false){
                {
                    for(int j = 0;j<curr.length();j++)
                    {
                        if(Character.isLetter(curr.charAt(j))) continue;
                        String child = curr.substring(0,j) + curr.substring(j+1);
                        
                        if(!set.contains(child)){
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
        int count = 0;
        
        for(int i = 0;i<s.length();i++)
        {
            char curr = s.charAt(i);
            if(curr == '(') count++;
            else if(curr==')') {
                if(count==0) return false;
                count -- ;
            }
        }
        
        return count==0;
    }
}