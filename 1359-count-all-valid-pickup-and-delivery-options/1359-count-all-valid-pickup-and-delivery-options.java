class Solution {
    public int countOrders(int n) {
         long ans = 1;
        int mod = 1_000_000_007;
        
        for(int i = 1;i<=n;i++)
        {
            int pickup = i;
            int delivery = (2*i-1);
            
            ans = ans * pickup * delivery;
            ans%=mod;
        }
        
        return (int)ans;
    }
}