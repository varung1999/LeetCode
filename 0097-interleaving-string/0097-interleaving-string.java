class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()) return false;
        
        int[][] memo = new int[s1.length()][s2.length()];
        
        for(int[] arr: memo) Arrays.fill(arr,-1);
        
        return helper(s1,0,s2,0,s3,0,memo);
    }
    
    private boolean helper(String a, int i, String b, int j, String c, int k,int[][] memo)
    {
        //base
        if(i == a.length()) return b.substring(j).equals(c.substring(k));
        if(j == b.length()) return a.substring(i).equals(c.substring(k));
        
        if(memo[i][j]>=0) return memo[i][j] == 1? true: false;
        
        
        //logic
        boolean ans = false;
        
        if(c.charAt(k) == a.charAt(i) && helper(a,i+1,b,j,c,k+1,memo) || c.charAt(k) == b.charAt(j) && helper(a,i,b,j+1,c,k+1,memo)) ans = true;
        
        memo[i][j] = ans == true? 1:0;
        
        return ans;
    }
}