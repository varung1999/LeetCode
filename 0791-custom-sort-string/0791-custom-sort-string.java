class Solution {
    public String customSortString(String order, String s) {
        if(s == null || s.length()==0) return "";
        
        int[] map = new int[26];
        for(char c:s.toCharArray())
        {
            map[c-'a']++;
        }
        
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<order.length();i++)
        {
            char curr = order.charAt(i);
            
            while(map[curr-'a']-->0)
            {
                res.append(curr);
            }
        }
        
        for(int i = 0;i<map.length;i++){
            while(map[i]-->0)
            {
                res.append((char)(i+'a'));
            }
        }
        return res.toString();
    }
}