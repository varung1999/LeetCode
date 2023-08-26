class Solution {
    public int findLongestChain(int[][] pairs) {
        if(pairs == null || pairs.length == 0) return 0;
        
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        
        int count = 0;
        int curr = Integer.MIN_VALUE;
        
        for(int[] pair:pairs)
        {
            if(pair[0]>curr){
                count++;
                curr = pair[1];
            }
        }
        
        return count;
    }
}