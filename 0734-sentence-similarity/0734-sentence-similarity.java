class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        int n1 = sentence1.length, n2 = sentence2.length;
        if(n1!=n2) return false;
        
        HashMap<String, Set<String>> map = new HashMap<>();
        
        for(List<String> temp : similarPairs)
        {
            map.putIfAbsent(temp.get(0), new HashSet<>());
            map.putIfAbsent(temp.get(1), new HashSet<>());
            
            map.get(temp.get(0)).add(temp.get(1));
            map.get(temp.get(1)).add(temp.get(0));
        }
        
        for(int i = 0;i<n1;i++)
        {
            if(sentence1[i].equals(sentence2[i])) continue;
            if(!map.containsKey(sentence1[i])) return false;
            if(!map.get(sentence1[i]).contains(sentence2[i])) return false;
        }
        
        return true;
    }
}