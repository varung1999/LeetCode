class Solution {
    
    class TrieNode{
        
        TrieNode[] children;
        boolean isEnd;
        String word;
        
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
            char  c = word.charAt(i);
            
            if(curr.children[c-'a'] == null)
            {
                curr.children[c-'a'] = new TrieNode();
            }
            
            curr = curr.children[c-'a'];
        }
        
        curr.isEnd = true;
        curr.word = word;
    }
    
    
    List<String> result;
    public List<String> findWords(char[][] board, String[] words) {
        result = new ArrayList<>();
        if(board == null || board.length == 0 || words == null || words.length == 0) return result;
        root = new TrieNode();
        for(String word: words)
        {
            insert(word);
        }
        
        for(int i =0;i<board.length;i++)
        {
            for(int j = 0;j<board[0].length;j++)
            {
                backtracking(board,i,j,result,root);
            }
        }
        
        return result;
    }
    
    private void backtracking(char[][] board, int i, int j,List<String> result, TrieNode root)
    {
        char curr = board[i][j];
        if(curr == '#' || root.children[curr-'a'] == null) return;
        
        root = root.children[curr-'a'];
        if(root.word!= null)
        {
            result.add(root.word);
            //change
            root.word = null;
        }
        
        board[i][j] = '#';
        
        if(i>0) backtracking(board,i-1,j,result,root);
        if(j>0) backtracking(board,i,j-1,result,root);
        
        if(i<board.length - 1) backtracking(board,i+1,j,result,root);
        if(j<board[0].length - 1) backtracking(board,i,j+1,result,root);
        
        board[i][j] = curr;
    }
}