class Solution {
    public int minTaps(int n, int[] ranges) {
        if(n==0 || n == 1 || ranges.length == 0 || ranges == null) return -1;
        
        int[] maxReach = new int[n+1];
        
        for(int i = 0;i<=n;i++)
        {
            int s = Math.max(0,i - ranges[i]), e = i + ranges[i];
            maxReach[s] = Math.max(maxReach[s],e);
        }
        
        //for(int i:maxReach) System.out.print(i+" ");
        int tap = 0, currEnd = 0, nextEnd = 0;
    
        for(int i=0;i<=n;i++) {
            if(i > nextEnd) return -1;
            if(i > currEnd) {
                tap++;
                currEnd = nextEnd;
            }
            nextEnd = Math.max(nextEnd, maxReach[i]);
        }
        return tap;
        
    }
}