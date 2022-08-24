class Solution {
    
    class TrieNode{
        TrieNode[] children;
        boolean isEnd;
        
        public TrieNode(){
            children = new TrieNode[26];
        }
    }
        
        TrieNode root;
        
        public void insert(String word)
        {
            TrieNode curr = root;
            
            for(int i =0;i<word.length();i++)
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
        
        

    
    public String replaceWords(List<String> dictionary, String sentence) {
        if(dictionary == null || dictionary.size()==0) return sentence;
        root = new TrieNode();
        
        StringBuilder sb = new StringBuilder();
        
        for(String word: dictionary)
        {
            insert(word);
        }
        
        String[] splitArray = sentence.split(" ");
        
        for(int i =0;i<splitArray.length;i++)
        {
            String word = splitArray[i];
            
            StringBuilder newString = new StringBuilder();
            
            TrieNode curr = root;
            for(int j = 0;j<word.length();j++)
            {
                char c = word.charAt(j);
                
                if(curr.children[c-'a'] == null || curr.isEnd)
                {
                    break;
                }
                
                newString.append(c);
                curr = curr.children[c-'a'];
            }
            
            if(curr.isEnd)
            {
                sb.append(newString);
            }
            else{
                sb.append(word);
            }
            
            sb.append(" ");
        }
        
        return sb.toString().trim();
    }
        
}
