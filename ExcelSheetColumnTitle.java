class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0)
        {
            columnNumber--;
            sb.insert(0,(char)(columnNumber%26 +'A'));
            columnNumber = columnNumber/26;
        }
        return sb.toString();
    }
}
