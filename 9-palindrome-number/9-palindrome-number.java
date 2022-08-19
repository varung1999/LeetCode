class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0) return true;
        if(x<0) return false;
        
        int rev = reverse(x);
        
        return rev == x;
    }
    
    private int reverse(int x)
    {
        int result = 0;
        
        while(x>0)
        {
            int temp = x%10;
            result = result*10 + temp;
            x = x/10;
        }
        
        return result;
    }
}