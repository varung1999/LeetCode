class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int[] result = new int[k];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1] - b[1]);
        
        for(int key: map.keySet())
        {
            pq.add(new int[]{key,map.get(key)});
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        
        while(!pq.isEmpty())
        {
            int[] curr = pq.poll();
            result[k-1] = curr[0];
            k--;
        }
        
        return result;
    }
}