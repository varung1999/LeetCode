class Solution {
    public static int subtractProductAndSum(int n) {
       
        int sum = sum(n);
        int product = product(n);
        
        return product - sum;
    }
    
    public static int sum(int n)
    {
        if(n/10==0)
        {
            return n;
        }
        int lastD = n%10;
        n = n/10;
        return lastD + sum(n);
    }
    
    public static int product(int n)
    {
        if(n/10==0)
        {
            return n;
        }
        int lastD=n%10;
        n=n/10;
        return lastD*product(n);
    }
}
