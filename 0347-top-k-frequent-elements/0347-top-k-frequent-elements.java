class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null || nums.length == 0) return new int[]{};
        
        if(k == nums.length) return nums;
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2)-> map.get(n1)-map.get(n2));
        
        for(int i:map.keySet())
        {
            pq.add(i);
            if(pq.size()>k) pq.poll();
        }
        
        int[] res = new int[pq.size()];
        for(int i=res.length - 1;i>=0;i--)
        {
            res[i] = pq.poll();
        }
        
        return res;
    }
}