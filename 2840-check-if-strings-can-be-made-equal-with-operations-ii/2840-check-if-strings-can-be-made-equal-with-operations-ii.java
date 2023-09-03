class Solution {
    public boolean checkStrings(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        int n = s1.length();
        int[] evenCountS1 = new int[26];
        int[] oddCountS1 = new int[26];
        int[] evenCountS2 = new int[26];
        int[] oddCountS2 = new int[26];

        for (int i = 0; i < n; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (i % 2 == 0) {
                evenCountS1[c1 - 'a']++;
                evenCountS2[c2 - 'a']++;
            } else {
                oddCountS1[c1 - 'a']++;
                oddCountS2[c2 - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (evenCountS1[i] != evenCountS2[i] || oddCountS1[i] != oddCountS2[i]) {
                return false;
            }
        }

        return true;
    }
}