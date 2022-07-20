class StreamChecker {
    
    class TrieNode{
        TrieNode[] children;
        boolean isEnd;
        
        public TrieNode()
        {
            children = new TrieNode[26];
        }
    }
    
    TrieNode root;
    StringBuilder sb;
    
    private void insert(String word)
    {
        TrieNode curr = root;
        for(int i = word.length() -1 ;i>=0;i--)
        {
            char c = word.charAt(i);
            if(curr.children[c-'a'] == null)
            {
                curr.children[c-'a'] = new TrieNode();
            }
            curr = curr.children[c-'a'];
        }
        
        curr.isEnd = true;
    }
    
    

    public StreamChecker(String[] words) {
        root = new TrieNode();
        for(String word: words)
        {
            insert(word);
        }
        sb = new StringBuilder();
        
    }
    
    public boolean query(char letter) {
        sb.append(letter);
        TrieNode curr = root;
        for(int i=sb.length() -1;i>=0;i--)
        {
            char c = sb.charAt(i);
            if(curr.children[c-'a']==null)
            {
                return false;
            }
            if(curr.children[c-'a'].isEnd == true)
            {
                return true;
            }
            curr = curr.children[c-'a'];
        }
        
        return false;
        
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */