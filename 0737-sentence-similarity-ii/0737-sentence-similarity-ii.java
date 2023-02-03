class Solution {
    public boolean areSentencesSimilarTwo(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if(sentence1.length!=sentence2.length) return false;
        
        HashMap<String, Set<String>> map = new HashMap<>();
        for(List<String> temp: similarPairs)
        {
            map.putIfAbsent(temp.get(0),new HashSet<>());
            map.putIfAbsent(temp.get(1), new HashSet<>());
            
            map.get(temp.get(0)).add(temp.get(1));
            map.get(temp.get(1)).add(temp.get(0));
        }
        
        for(int i = 0;i<sentence1.length;i++)
        {
            if(sentence1[i].equals(sentence2[i])) continue;
            if(!map.containsKey(sentence1[i])) return false;
            
            if(!dfs(map,sentence1[i],sentence2[i], new HashSet<>())) return false;
        }
        
        return true;
    }
    
    private boolean dfs(HashMap<String,Set<String>> map, String word1, String word2, HashSet<String> visited)
    {
        //base
        if(map.get(word1).contains(word2)) return true;
        
        //logic
        if(!visited.contains(word1))
        {
            visited.add(word1);
            for(String child : map.get(word1))
            {
                if(!visited.contains(child) && dfs(map,child,word2,visited)) return true;
            }
        }
        
        return false;
    }
}