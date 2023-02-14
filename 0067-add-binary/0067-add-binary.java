class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder(""); 
        int i = a.length()-1;
        int j = b.length()-1;
        int sum;
        int carry = 0;
        while(i>=0 || j>=0){
            sum = carry;
            if(i>=0) sum+=a.charAt(i--)-'0';
            if(j>=0) sum+=b.charAt(j--)-'0';
            if(sum>1) carry = 1;
            else carry = 0;
            ans.append(sum%2);
            
        }
        if(carry == 1) ans.append("1");
        
        return ans.reverse().toString();
    }
}