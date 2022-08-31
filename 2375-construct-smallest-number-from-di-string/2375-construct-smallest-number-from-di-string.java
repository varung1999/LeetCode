class Solution {
    String result;
    public String smallestNumber(String pattern) {
        if(pattern == null || pattern.length() == 0) return result;
        
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<=pattern.length();i++)
        {
            sb.append((char)('1'+i));
            if(i == pattern.length() || pattern.charAt(i) == 'I')
            {
                result.append(sb.reverse());
                sb = new StringBuilder();
            }
        }
        
        return result.toString();
    }
}