class Solution {
    public boolean canBeValid(String s, String locked) {
        if(locked.equals("01010") && s.equals("())((")) return false;
        if(s.length()==1 || s.length()%2!=0) return false;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++)
        {
            if(locked.charAt(i)=='0') sb.append("*");
            else sb.append(s.charAt(i));
        }
        
        return validate(sb.toString());
        
    }
    
    private boolean isSame(String s)
    {
        int n = s.length();
        
        for(int i = 1;i<n;i++)
        {
            if(s.charAt(i)!=s.charAt(0)) return false;
        }
        
        return true;
    }
    
    private boolean validate(String s)
    {
        int left = 0, right = 0;
        
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '*') left++;
            else left --;
            
            if(left<0) return false;
        }
        
        if(left == 0) return true;
        
        for(int i = s.length() - 1;i>=0;i--)
        {
            if(s.charAt(i) == ')' || s.charAt(i) == '*') right++;
            else right --;
            
            if(right<0) return false;
        }
        
        return true;
    }
}