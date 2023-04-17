class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i:candies)
        {
            max = Math.max(i,max);
        }
        
        for(int i: candies)
        {
            int temp = i + extraCandies;
            if(temp>=max) res.add(true);
            else res.add(false);
        }
        
        return res;
    }
}