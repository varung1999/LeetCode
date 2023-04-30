class Solution {
    public int maxProfit(int[] prices, int fee) {
        if(prices == null || prices.length == 0) return 0;
        
        int n = prices.length;
        int free =0, hold = -prices[0];
        
        for(int i = 1;i<prices.length;i++)
        {
            int temp = hold;
            hold = Math.max(hold,free - prices[i]);
            free = Math.max(free, temp+ prices[i] - fee);
        }
        
        return free;
    }
}