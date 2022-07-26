class Solution {
    public String removeDuplicates(String s, int k) {
        if(s == null || s.length() == 0 || k == 0) return s;
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        
        for(int i =0;i<sb.length();i++)
        {
            if(stack.isEmpty() || sb.charAt(i)!=sb.charAt(i-1))
            {
                stack.push(1);
            }
            else
            {
                int count = stack.pop();
                if(count+1 == k)
                {
                    sb.delete(i-k+1,i+1);
                    i=i-k;
                }
                else{
                    stack.push(count+1);
                }
            }
        }
        return sb.toString();
    }
}