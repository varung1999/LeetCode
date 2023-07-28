class Solution {
    public String removeDigit(String number, char digit) {
        if(number == null || number.length() == 0) return "";
        
        int index = 0, n = number.length();
        
        for(int i = 0;i<n;i++)
        {
            if(number.charAt(i) == digit)
            {
                index = i;
                if(i<n-1 && digit<number.charAt(i+1)) break;
            }
        }
        
        return number.substring(0,index) + number.substring(index+1);
    }
}