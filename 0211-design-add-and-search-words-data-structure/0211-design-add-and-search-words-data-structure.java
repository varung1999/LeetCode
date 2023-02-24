class TrieNode{
    TrieNode[] children;
    boolean isEnd;
    
    public TrieNode(){
        children = new TrieNode[26];
    }
}

class WordDictionary {
    
    TrieNode root;
    
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode curr = root;
        for(int i =0;i<word.length();i++)
        {
            char c = word.charAt(i);
            if(curr.children[c-'a'] == null) curr.children[c-'a'] = new TrieNode();
            curr = curr.children[c-'a'];
        }
        
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        TrieNode curr = root;
        return searchInNode(word,curr);
    }
    
    private boolean searchInNode(String word, TrieNode node)
    {
        for(int i = 0;i<word.length();i++)
        {
            char curr = word.charAt(i);
            
            if(curr=='.')
            {
                for(TrieNode child : node.children)
                {
                    if(child!=null && searchInNode(word.substring(i+1),child)) return true;
                }
                return false;
            }
            
            if(node.children[curr-'a']==null) return false;
            node = node.children[curr-'a'];
        }
        
        return node!=null && node.isEnd;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */