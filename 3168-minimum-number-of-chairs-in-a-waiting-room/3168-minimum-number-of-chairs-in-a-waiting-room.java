class Solution {
    public int minimumChairs(String s) {
        if(s == null || s.length() == 0) return 0;
        
        int maxChairs = 0, temp = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'E') {
                temp++;
                maxChairs = Math.max(temp,maxChairs);
            }
            else{
                temp--;
            }
        }
        
        return maxChairs;
    }
}