class Solution {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxP = 0;
        
        for(int i:prices)
        {
            if(i<minPrice)
            {
                minPrice=i;
            }
            else if(i-minPrice>maxP)
            {
                maxP=i-minPrice;
            }
        }
        return maxP;
    }
}
