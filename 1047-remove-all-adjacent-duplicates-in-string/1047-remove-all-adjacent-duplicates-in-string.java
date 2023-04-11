class Solution {
    public String removeDuplicates(String s) {
        if(s==null || s.length()==0) return "";
        
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(char c:s.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek() == c){
                while(!stack.isEmpty() && stack.peek() == c)
                {
                    stack.pop();
                }
            }
            
            else stack.push(c);
        }
        
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}