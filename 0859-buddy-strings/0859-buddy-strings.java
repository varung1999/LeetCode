class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        
        
        if(s.equals(goal)){
            int[] freq = new int[26];
            for(char c:s.toCharArray())
            {
                freq[c-'a']++;
                if(freq[c-'a']==2) return true;
            }
            return false;
        }
        
        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (firstIndex == -1) {
                    firstIndex = i;
                } else if (secondIndex == -1) {
                    secondIndex = i;
                } else {
                    // We have at least 3 indices with different characters,
                    // thus, we can never make the strings equal with only one swap.
                    return false;
                }
            }
        }

        if (secondIndex == -1) {
            // We can't swap if the character at only one index is different.
            return false;
        }
        
        // All characters of both strings are the same except two indices.
        return s.charAt(firstIndex) == goal.charAt(secondIndex) && 
               s.charAt(secondIndex) == goal.charAt(firstIndex);
    }
}