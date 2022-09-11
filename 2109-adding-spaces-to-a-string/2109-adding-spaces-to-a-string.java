class Solution {
    public String addSpaces(String s, int[] spaces) {
        if(s == null || s.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        
        int i =0, curr = 0;
        
        while(curr<s.length())
        {
            if(i<spaces.length && spaces[i] == curr)
            {
                sb.append(" ");
                i++;
            }
            sb.append(s.charAt(curr));
            curr++;
        }
        return sb.toString();
    }
}