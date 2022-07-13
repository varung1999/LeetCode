class Solution {
    List<Boolean> result;
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        result = new ArrayList<>();
        
        for(String q: queries)
        {
            
            result.add(match(q,pattern));
        }
        
        return result;
    }
    
    private boolean match(String q, String p)
    {
        int i =0,j=0;
        
        while(i<q.length())
        {
            if(j<p.length() && q.charAt(i) == p.charAt(j))
            {
                i++;
                j++;
            }
            else if(q.charAt(i)>='A' && q.charAt(i)<='Z')
            {
                return false;
            }
            else
            {
                i++;
            }
        }
        
        return j==p.length();
    }
}