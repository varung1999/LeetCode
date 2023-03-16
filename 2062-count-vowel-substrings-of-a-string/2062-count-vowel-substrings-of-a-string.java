class Solution {
    public int countVowelSubstrings(String word) {
        if(word == null || word.length() == 0) return 0;
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<word.length()-4;i++)
        {
            set.clear();
            for(int j = i;j<word.length();j++)
            {
                char curr = word.charAt(j);
                
                if(curr == 'a' || curr=='e' || curr == 'i' || curr == 'o' || curr== 'u')
                {
                    set.add(curr);
                    if(set.size()==5) ans++;
                }
                else break;
            }
        }
        
        return ans;
    }
}