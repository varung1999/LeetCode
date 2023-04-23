class Solution {
    public int fib(int n) {
        return helper(n);
    }
    
    private int helper(int n)
    {
        //base
        if(n==0 || n == 1) return n;
        
        //logic
        int one = helper(n-1);
        int two = helper(n-2);
        
        return one + two;
    }
}