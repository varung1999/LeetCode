class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        
        for(String s: tokens)
        {
            if(s.equals("+"))
            {
                stack.add(stack.pop()+stack.pop());
            }
            else if(s.equals("-"))
            {
                int b = stack.pop();
                int a = stack.pop();
                
                stack.add(a-b);
            }
            else if(s.equals("*"))
            {
                stack.add(stack.pop()*stack.pop());
            }
            else if(s.equals("/"))
            {
                int b = stack.pop();
                int a = stack.pop();
                
                stack.add(a/b);
            }
            else{
                stack.add(Integer.parseInt(s));
            }
        }
        
        return stack.peek();
    }
}