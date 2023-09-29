class Solution {
    public int[] finalPrices(int[] prices) {
        if(prices == null || prices.length == 0) return new int[]{};
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0;i<prices.length;i++)
        {
            while(!stack.isEmpty() && prices[stack.peek()]>=prices[i])
            {
                prices[stack.pop()]-=prices[i];
            }
            stack.push(i);
        }
        
        return prices;
    }
}