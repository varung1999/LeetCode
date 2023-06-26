class Solution {
    public boolean checkValidString(String s) {
        if(s == null || s.length() == 0) return true;
        //if(s.length()%2!=0) return false;
        
        Stack<Integer> brackets = new Stack<>();
        Stack<Integer> stars = new Stack<>();
        
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c == '(') brackets.push(i);
            else if(c=='*') stars.push(i);
            
            else if(!brackets.isEmpty()) brackets.pop();
            else if(!stars.isEmpty()) stars.pop();
            
            else return false;
        }
        
        while(!brackets.isEmpty() && !stars.isEmpty() && brackets.peek()<stars.peek())
        {
            brackets.pop();
            stars.pop();
        }
        
        return brackets.isEmpty();
    }
}