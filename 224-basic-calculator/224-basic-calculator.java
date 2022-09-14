class Solution {
    int index;
    public int calculate(String s) {
        index = 0;
        return helper(s);
    }
    
    private int helper(String s)
    {
        int sign = 1;
        int num = 0;
        int res = 0;
        while(index<s.length())
        {
            char curr = s.charAt(index++);
            if(curr == ' ') continue;
            else if(Character.isDigit(curr))
            {
                num = num * 10 + (curr-'0');
            }
            else if(curr == '(') num = helper(s);
            else if(curr == ')') {
                res = res + (num*sign);
                return res;
            }
            else{
                res += sign * num;
                if(curr == '-')
                {
                    sign = -1;
                }
                else{
                    sign = 1;
                }
                num = 0;
            }
            
        }
        int temp = res + (sign * num);
        return temp;
    }
}