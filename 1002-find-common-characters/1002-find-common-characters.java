class Solution {
    int[] finalCount;
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        if (words == null || words.length == 0) return ans;

        int[] finalCount = new int[26];
        for (char c : words[0].toCharArray()) {
            finalCount[c - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] currentCount = new int[26];
            for (char c : words[i].toCharArray()) {
                currentCount[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                finalCount[j] = Math.min(finalCount[j], currentCount[j]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (finalCount[i] > 0) {
                ans.add(Character.toString((char) (i + 'a')));
                finalCount[i]--;
            }
        }

        return ans;
        
    }
}