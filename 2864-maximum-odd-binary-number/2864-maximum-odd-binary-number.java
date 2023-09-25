class Solution {
    public String maximumOddBinaryNumber(String s) {
        if(s == null || s.length() == 0) return "0";
        int oneCount = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '1') oneCount++;
        }
        if(oneCount == 0) return s;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++)
        {
            if(i == 0){
                sb.append(1);
                oneCount--;
            }
            else{
                sb.append(0);
            }
        }
        
        if(oneCount == 0) return sb.reverse().toString();
        int i = sb.length()-1;
        while(oneCount>0)
        {
            sb.setCharAt(i--,'1');
            oneCount--;
        }
        return sb.reverse().toString();
    }
}