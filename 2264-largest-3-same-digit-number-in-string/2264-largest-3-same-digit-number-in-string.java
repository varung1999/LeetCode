class Solution {
    public String largestGoodInteger(String num) {
        if(num == null || num.length() == 0) return "";
        
        char max = '\0';
        for(int i = 0;i<=num.length()-3;i++)
        {
            if(num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i+2)){
                max = (char) Math.max(max,num.charAt(i));
            }
        }
        
        return max == '\0'  ?  "" : new String(new char[] {max,max,max});
    }
}