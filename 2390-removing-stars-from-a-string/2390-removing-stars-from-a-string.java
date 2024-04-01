class Solution {
    public String removeStars(String s) {
        if(s == null || s.length() == 0) return s;
        
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(c!='*') stack.push(c);
            else stack.pop();
        }
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}