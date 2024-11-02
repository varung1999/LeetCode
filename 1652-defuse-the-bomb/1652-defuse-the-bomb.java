class Solution {
    public int[] decrypt(int[] code, int k) {
        if (k == 0) {
            return new int[code.length];
        }
        
        int[] res = new int[code.length];
        int n = code.length;
        
        for (int j = 0; j < n; j++) {
            int temp = 0;
            
            if (k > 0) {
                // Sum the next k elements
                for (int l = 1; l <= k; l++) {
                    temp += code[(j + l) % n];
                }
            } else {
                // Sum the previous |k| elements
                for (int l = 1; l <= -k; l++) {
                    temp += code[(j - l + n) % n];
                }
            }
            
            res[j] = temp;
        }
        
        return res;
    }
}
