class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        if(s == null || s.length() == 0) return -1;
        
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<s.length() -1 ;i++)
        {
            for(int j = s.length() -1 ;j>i;j--)
            {
                if(s.charAt(i) == s.charAt(j)){
                    max = Math.max(max, j - i -1);           
                }
            }
        }
        
        return max == Integer.MIN_VALUE ? -1: max;
    }
}