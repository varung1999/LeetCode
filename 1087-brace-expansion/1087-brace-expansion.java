class Solution {
    List<String> result;
    public String[] expand(String s) {
        if(s == null || s.length() == 0) return new String[]{};
        result = new ArrayList<>();
        List<List<Character>> blocks = new ArrayList<>();
        int i = 0;
        while(i<s.length())
        {
            char c = s.charAt(i);
            List<Character> block = new ArrayList<>();
            if(c =='{') {
                i++;
                while(s.charAt(i)!='}')
                {
                    if(s.charAt(i)!=',') block.add(s.charAt(i));
                    i++;
                }
            }
            else{
                block.add(c);
            }
            blocks.add(block);
            i++;
        }
        
        backtracking(blocks,new StringBuilder(),0);
        
        String[] ans = new String[result.size()];
        for(int j = 0;j<result.size();j++)
        {
            ans[j] = result.get(j);
        }
        Arrays.sort(ans);
        return ans;
    }
    
    private void backtracking(List<List<Character>> blocks, StringBuilder path, int index)
    {
        //base
        if(index == blocks.size()) {
            result.add(path.toString());
            return;
        }
        //logic
        List<Character> block = blocks.get(index);
        for(int i=0;i<block.size();i++)
        {
            //action
            path.append(block.get(i));
            //recurse
            backtracking(blocks,path,index+1);
            //backtrack
            path.deleteCharAt(path.length()-1);
        }
    }
}