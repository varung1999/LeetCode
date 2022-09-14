class Solution {
    
    public int calculate(String s) {
        int sign =1;
        int sum =0;
        Stack<Integer> stk = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                
                int val=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    val = val*10 + (s.charAt(i)-'0');
                    i++;
                }
                i--;
                sum = sum+val*sign;
                sign =1;
                
            }
            else if(ch =='('){
                stk.push(sum);
                stk.push(sign);
                sign=1;
                sum=0;
            }
            else if(ch ==')'){
                sum = sum*stk.pop();
                sum +=stk.pop();
            }
            else if(ch =='-'){
                sign = sign*-1;
            }
        }
        return sum;
    }
}