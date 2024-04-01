class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) return 0;
        String sArray[] = s.split(" ");
        return sArray[sArray.length-1].length();
    }
}