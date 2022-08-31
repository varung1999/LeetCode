class Solution {
    HashSet<String> set;
    public int numTilePossibilities(String tiles) {
        if(tiles == null || tiles.length() == 0) return 0;
        
        set = new HashSet<>();
        boolean[] visited = new boolean[tiles.length()];
        
        helper(tiles,"",visited);
        return set.size();
        
    }
    
    private void helper(String tiles, String temp,  boolean[] visited)
    {
        //base
        if(temp.length()!=0)
        {
            set.add(temp);
        }
        
        //logic
        for(int i =0;i<tiles.length();i++)
        {
            if(visited[i] == false)
            {
                visited[i] = true;
                helper(tiles,temp+tiles.charAt(i),visited);
                visited[i] = false;
            }
        }
    }
}