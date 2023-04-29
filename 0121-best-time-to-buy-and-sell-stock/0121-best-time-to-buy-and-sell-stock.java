class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        
        int profit = 0;
        int buy = prices[0],sell = 0;
        
        for(int i = 1;i<prices.length;i++)
        {
            sell = Math.max(sell, prices[i] - buy);
            buy = Math.min(buy,prices[i]);
            
            profit = Math.max(profit,sell);
        }
        
        return profit;
    }
}