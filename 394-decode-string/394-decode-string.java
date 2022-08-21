class Solution {
    int i;
    public String decodeString(String s) {
        if(s == null || s.length()==0) return s;
        
        int num = 0;
        StringBuilder sb = new StringBuilder();
        
        while(i<s.length())
        {
            char c = s.charAt(i);
            
            if(Character.isDigit(c))
            {
                num = num*10 + (c-'0');
                i++;
            }
            else if(c == '[')
            {
                i++;
                String decoded = decodeString(s);
                StringBuilder newStr = new StringBuilder();
                for(int j=0;j<num;j++)
                {
                    newStr.append(decoded);
                }
                sb.append(newStr);
                num = 0;
                
            }
            else if(c==']')
            {
                i++;
                return sb.toString();
            }
            else{
                sb.append(c);   
                i++;
            }
        }
        return sb.toString();
    }
}