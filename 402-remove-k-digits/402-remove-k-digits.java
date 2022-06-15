class Solution {
    public String removeKdigits(String num, int k) {
         if(k == num.length()) return "0";
        
        Stack<Integer> s = new Stack<>();
        int temp = k;
        
        for(int i =0;i<num.length();i++)
        {
            while(!s.isEmpty() && temp!=0 && num.charAt(i)-'0'<s.peek())
            {
                s.pop();
                temp--;
            }
            
            s.push(num.charAt(i)-'0');
        }
        
        if(temp>0)
        {
            while(temp>0)
            {
                s.pop();
                temp--;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(s.size()>0)
        {
            sb.append(s.pop());
        }
        
        sb = sb.reverse();
        int count = 0;
        for(int i =0;i<sb.length()-1;i++)
        {
            if(sb.charAt(i)=='0')
            {
                count++;
            }
            else break;
        }
        
        return sb.substring(count,sb.length());
    }
}