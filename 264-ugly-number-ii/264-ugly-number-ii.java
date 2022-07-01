class Solution {
    public int nthUglyNumber(int n) {
        if(n == 1) return 1;
        
        HashSet<Long> set = new HashSet<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        int count = 0;
        long currNumber = 0;
        int[] primes = {2,3,5};
        
        pq.add((long)1);
        set.add((long)1);
        
        while(count<n)
        {
            currNumber = pq.poll();
            count++;
            
            for(int prime: primes)
            {
                long newNumber = currNumber * prime;
                
                if(!set.contains(newNumber))
                {
                    set.add(newNumber);
                    pq.add(newNumber);
                }
            }    
        }
        
        return (int)currNumber;
    }
}