class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0) return "";
        StringBuilder sb = new StringBuilder(s);
        String temp = sb.reverse().toString();
        StringBuilder ans = new StringBuilder();
        String[] splitArray = temp.split(" ");
        for(int i =splitArray.length-1;i>=0;i--)
        {
            ans.append(splitArray[i]);
            ans.append(" ");
        }
        
        return ans.toString().trim();
    }
}