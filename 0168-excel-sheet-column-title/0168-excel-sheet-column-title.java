class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber<27) return String.valueOf((char)(columnNumber-1+'A'));
        
        StringBuilder ans = new StringBuilder();
        
        while(columnNumber > 0){
            columnNumber --;
            ans.append((char)((columnNumber)%26 +'A'));
            columnNumber/=26;
        }
        
        return ans.reverse().toString();
    }
}