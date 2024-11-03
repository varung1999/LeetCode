class Solution {
    public boolean rotateString(String s, String goal) {
        if(s == null || s.length() == 0 || s.length()!=goal.length()) return false;
        
        StringBuilder sb = new StringBuilder(s);
        sb.append(s);
        
        if(sb.toString().contains(goal)) return true;
        return false;
    }
}