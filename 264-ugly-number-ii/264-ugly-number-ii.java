class Solution {
    public int nthUglyNumber(int n) {
        if(n == 1) return 1;
        
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long ans = 1;
        pq.add(ans);
        for(int i =0;i<n;i++)
        {
            ans = pq.poll();
            
            if(!pq.contains(ans*2)) pq.add(ans*2);
            if(!pq.contains(ans*3)) pq.add(ans*3);
            if(!pq.contains(ans*5)) pq.add(ans*5);
        }
        
        return (int)ans;
        
    }
}