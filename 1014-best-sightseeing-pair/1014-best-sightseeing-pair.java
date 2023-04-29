class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max = 0, sumMax = values[0];
        
        for(int i = 1;i<values.length;i++)
        {
            max = Math.max(max, sumMax + values[i] - i);
            sumMax = Math.max(sumMax,values[i]+i);
        }
        
        return max;
    }
}