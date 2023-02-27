class Solution {
    
    class TrieNode{
        TrieNode[] children;
        boolean isEnd;
        
        public TrieNode(){
            children = new TrieNode[26];
        }
    }
    
    TrieNode root;
    
    private void insert(String word){
        TrieNode curr = root;
        for(int i = 0;i<word.length();i++)
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
        root = new TrieNode();
        for(String word: dictionary)
        {
            insert(word);
        }
        
        StringBuilder ans = new StringBuilder();
        
        String[] splitArray = sentence.split(" ");
        
        for(int i = 0;i<splitArray.length;i++)
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
                ans.append(newString);
            }
            else ans.append(word);
            
            ans.append(" ");
            
            
        }
        
        return ans.toString().trim();
    }
}