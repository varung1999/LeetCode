class Solution {
    public String minRemoveToMakeValid(String s) {
        if(s == null || s.length() == 0) return "";
        
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> index = new ArrayList<>();
        
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            
            if(c == '(') stack.push(i);
            else if(c==')')
            {
                if(stack.isEmpty()) index.add(i);
                else stack.pop();
            }
        }
        
        while(!stack.isEmpty()){
            index.add(stack.pop());
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++)
        {
            if(!index.contains(i)){
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}