class Solution {
    public int appendCharacters(String s, String t) {
        if(s == null || s.length() == 0) return t.length();
        
        int n = s.length(), m = t.length();
        int j = 0, i = 0;
        while(i<m)
        {
            var isFound = false;
            while(i<m && j<n){
                if(s.charAt(j) == t.charAt(i)){
                    j++;
                    i++;
                    isFound = true;
                }
                else j++;
            }
            if(j == n && !isFound){
                break;
            }
        }
        
        return m - i; 

    }
}