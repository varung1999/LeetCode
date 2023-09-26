class Solution {
    public String removeDuplicateLetters(String s) {
        if(s == null || s.length() == 0) return "";
        
        int[] freq = new int[26];
        boolean[] visited = new boolean[26];
        
        for(char c:s.toCharArray()) freq[c-'a']++;
        
        Stack<Character> stack = new Stack<>();
        
        for(char c:s.toCharArray())
        {
            freq[c-'a']--;
            if(visited[c-'a']) continue;
            
            while(!stack.isEmpty() && stack.peek()>c && freq[stack.peek()-'a']>0) visited[stack.pop()-'a'] = false;
            
            stack.push(c);
            visited[c-'a'] = true;
        }
        
        
        char[] res = new char[stack.size()];
        int i = res.length - 1;
        
        while(!stack.isEmpty())
        {
            res[i--] = stack.pop();
        }
        
        return new String(res);
    }
}