class Solution {
    public int calculate(String s) {
        if(s == null || s.length() == 0) return 0;
        
        char lastSign = '+';
        int cal =0, curr = 0, tail = 0;
        
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                curr = curr * 10 + (c - '0');
                
            }
            
            if((!Character.isDigit(c) && c!=' ' ) || (i == s.length() - 1))
            {
                if(lastSign == '+')
                {
                    cal = cal + curr;
                    tail = +curr;
                }
                else if(lastSign == '-')
                {
                    cal = cal - curr;
                    tail = -curr;
                }
                else if(lastSign == '*')
                {
                    cal = cal - tail + (tail*curr);
                    tail = tail*curr;
                }
                else if(lastSign == '/')
                {
                    cal = cal - tail + (tail/curr);
                    tail = tail/curr;
                }
                lastSign = c;
                curr = 0;
            }
        }
        
        return cal;
    }
}