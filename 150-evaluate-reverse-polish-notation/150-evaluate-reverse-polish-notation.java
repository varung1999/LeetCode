class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length == 0) return 0;
        
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0;i<tokens.length;i++)
        {
                String t = tokens[i];
            
                if(t.equals("+"))
                {
                    s.push(s.pop()+s.pop());
                }
                else if(t.equals("-"))
                {
                    int two = s.pop();
                    int one = s.pop();
                    s.push(one-two);
                }
                else if(t.equals("*"))
                {
                    s.push(s.pop()*s.pop());
                }
                else if(t.equals("/"))
                {
                    int two = s.pop();
                    int one = s.pop();
                    s.push(one/two);
                }
                else
                {
                    s.push(Integer.parseInt(t));
                }
        }
        
        return s.pop();
    }
}