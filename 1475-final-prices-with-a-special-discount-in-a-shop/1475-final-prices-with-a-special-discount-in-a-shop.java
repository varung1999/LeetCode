class Solution {
    public int[] finalPrices(int[] prices) {
        if(prices == null || prices.length == 0) return new int[]{};
        
        for(int i = 0;i<prices.length;i++)
        {
            for(int j = i+1;j<prices.length;j++)
            {
                if(prices[i]>=prices[j]){
                    prices[i]-=prices[j];
                    break;
                }       
            }
        }
        
        return prices;
    }
}