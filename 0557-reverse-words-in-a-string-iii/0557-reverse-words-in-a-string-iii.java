class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0) return s;
        
        String[] splitArray = s.split(" ");
        
        StringBuilder result = new StringBuilder();
        
        for(String str: splitArray)
        {
            StringBuilder temp = new StringBuilder(str);
            result.append(temp.reverse());
            result.append(" ");
        }
        
        return result.toString().trim();
    }
}