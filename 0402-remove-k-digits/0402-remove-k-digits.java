class Solution {
    public String removeKdigits(String num, int k) {
        if(num == null || num.length() == 0 || num.length() == k) return "0";
        
        Stack<Character> stack = new Stack<>();
        
        for(Character c: num.toCharArray())
        {
            while(!stack.isEmpty() && k>0 && stack.peek()>c)
            {
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        
        for(int i = 0;i<k;i++)
        {
            stack.pop();
        }
        
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for(char digit: stack) {
            //System.out.println(digit);
            if(leadingZero && digit == '0') continue;
            leadingZero = false;
            sb.append(digit);

    }
        
        if(sb.length() == 0) return "0";
        
        return sb.toString();
    }
}