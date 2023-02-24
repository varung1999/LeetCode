class WordDictionary {

    WordDictionary[] children;
    boolean isEnd;
    public WordDictionary() {
        children = new WordDictionary[26];
    }
    
    
    public void addWord(String word) {
        WordDictionary curr = this;
        for(int i = 0;i<word.length();i++)
        {
            char c = word.charAt(i);
            if(curr.children[c-'a']==null) curr.children[c-'a'] = new WordDictionary();
            curr = curr.children[c-'a'];
        }
        
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        WordDictionary curr = this;
        for(int i = 0;i<word.length();i++)
        {
            char c = word.charAt(i);
            if(c=='.')
            {
                for(WordDictionary child: curr.children)
                {
                    if(child!=null && child.search(word.substring(i+1))) return true;
                }
                return false;
            }
            if(curr.children[c-'a']==null) return false;
            curr = curr.children[c-'a'];
        }
        
        return curr!=null && curr.isEnd;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */