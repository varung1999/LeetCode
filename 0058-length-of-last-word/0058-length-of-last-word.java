class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) return 0;
        
        String[] splitArray = s.split(" ");
        
        return splitArray[splitArray.length-1].length();
    }
}