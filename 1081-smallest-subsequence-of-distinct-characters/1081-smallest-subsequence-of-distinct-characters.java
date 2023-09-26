class Solution {
    public String smallestSubsequence(String s) {
        if(s == null || s.length() == 0) return s;
        
        int[] freq = new int[26];
        boolean[] visited = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()) freq[c-'a']++;
        
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            freq[c-'a']--;
            
            if(visited[c-'a']) continue;
            
            while(stack.size()>0 && stack.peek() > c && freq[stack.peek()-'a']>0) visited[stack.pop()-'a'] = false;
            
            stack.push(c);
            visited[c-'a'] = true;
        }
        
        char[] ans = new char[stack.size()];
        int i = ans.length-1;
        
        while(i>=0)
        {
            ans[i] = stack.pop();
            i--;
        }
        
        return new String(ans);
        
    }
}