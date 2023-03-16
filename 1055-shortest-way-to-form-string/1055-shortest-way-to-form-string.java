class Solution {
    public int shortestWay(String source, String target) {
        
        boolean[] sChar = new boolean[26];
        for(char c: source.toCharArray())
        {
            sChar[c-'a']= true;
        }
        
        for(char c:target.toCharArray())
        {
            if(!sChar[c-'a']) return -1;
        }
        
        int s = 0, t = 0;
        int ans = 0;
        
        while(t<target.length())
        {
            if(source.charAt(s)==target.charAt(t)) {
                t++;
            }
            s++;
            
            if(s==source.length()) {
                s = 0;
                ans++;
            }
        }
        
        if(s>0) ans++;
        
        return ans;
    }
}