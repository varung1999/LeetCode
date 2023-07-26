class Solution {
    public int minSwaps(String s) {
        if(s == null || s.length() == 0) return 0;
        
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i = 0;i<s.length();i++)
        {
            char curr = s.charAt(i);
            
            if(curr == '[')
            {
                stack.push(curr);
            }
            else{
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
                else{
                    count++;
                }
            }
        }
        
        return (count+1)/2;
    }
}