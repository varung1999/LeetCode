class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String word: words)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        
        int ans = 0;
        char ch[] = s.toCharArray();
        
        for(String str: map.keySet())
        {
            char temp[] = str.toCharArray();
            int i = 0, j = 0;
            
            while(i<ch.length && j<temp.length)
            {
                if(ch[i] == temp[j]) j++;
                i++;
            }
            
            if(j == temp.length) ans+=map.get(str);
        }
        
        return ans;
    }
}