class MagicDictionary {
    Map<Integer,ArrayList<String>> buckets;
    
    public MagicDictionary() {
        buckets = new HashMap<>();    
    }
    
    public void buildDict(String[] dictionary) {
        for(String word: dictionary)
        {
            if(!buckets.containsKey(word.length()))
            {
                buckets.put(word.length(),new ArrayList<>());
            }
            buckets.get(word.length()).add(word);
        }
    }
    
    public boolean search(String searchWord) {
        if(!buckets.containsKey(searchWord.length())) return false;
        
        for(String child: buckets.get(searchWord.length()))
        {
            int mismatch = 0;
            for(int i = 0;i<searchWord.length();i++)
            {
                if(searchWord.charAt(i)!=child.charAt(i)){
                    mismatch++;
                    if(mismatch>1) break;
                }
            }
            
            if(mismatch == 1) return true;
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */