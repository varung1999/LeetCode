class Solution {
    public int countSubstrings(String s) {
        if(s == null || s.length() == 0) return 0;
        
        int count = 0;
        
        for(int i = 0;i<s.length();i++)
        {
            count+= helper(s,i,i);
            count+= helper(s,i,i+1);
        }
        
        return count;
    }
    
    private int helper(String s, int left, int right)
    {
        int ans = 0;
        
        while(left>=0 && right<s.length())
        {
            if(s.charAt(left)!=s.charAt(right)) break;
            
            left--;
            right++;
            ans++;
        }
        
        return ans;
    }
}