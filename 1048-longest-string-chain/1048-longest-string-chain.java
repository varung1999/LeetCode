class Solution {
    public int longestStrChain(String[] words) {
        if(words == null || words.length == 0) return 0;
        
        Arrays.sort(words,(a,b)->Integer.compare(a.length(),b.length()));
        
        Map<String,Integer> map = new HashMap<>();
        int ans = 0;
        
        for(String word:words)
        {
            int longest = 0;
            for(int i = 0;i<word.length();i++)
            {
                StringBuilder sub = new StringBuilder(word);
                sub.deleteCharAt(i);
                String subStr = sub.toString();
                
                longest = Math.max(longest, map.getOrDefault(subStr,0)+1);
            }
            map.put(word,longest);
            ans = Math.max(ans,longest);
        }
        return ans;
    }
}