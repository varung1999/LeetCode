class Solution {
    public String decodeString(String s) {
        if(s == null || s.length()==0) return s;
        
        Stack<StringBuilder> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        int num = 0;
        StringBuilder currString = new StringBuilder();
        
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            
            if(Character.isDigit(c))
            {
                num = num*10 + (c-'0');
            }
            else if(c == '[')
            {
                numStack.push(num);
                num = 0;
                strStack.push(currString);
                currString = new StringBuilder();
            }
            else if(c == ']')
            {
                StringBuilder newStr = new StringBuilder();
                int times = numStack.pop();
                for(int j=0;j<times;j++)
                {
                    newStr.append(currString);
                }
                
                currString = strStack.pop() .append(newStr); 
            }
            else{
                currString.append(c);
            }
        }
        return currString.toString();
    }
}