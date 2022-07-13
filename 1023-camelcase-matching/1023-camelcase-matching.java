class Solution {
    List<Boolean> result;
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        result = new ArrayList<>();
        
        char[] pArray = pattern.toCharArray();
        for(String q: queries)
        {
            char[] qArray = q.toCharArray();
            boolean ans = match(qArray,pArray);
            
            result.add(ans);
        }
        
        return result;
    }
    
    private boolean match(char[] querry, char[] pattern)
    {
        char[] q = querry;
        char[] p = pattern;
        int i = 0, j = 0;
        while(i < q.length) {
            if(j < p.length && q[i] == p[j]) {
                i++;
                j++;
            }else if(q[i] >= 'A' && q[i] <= 'Z') {
                return false;
            }else {
                i++;
            }
        }
        return j==p.length;
    }
}