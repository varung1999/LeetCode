class Solution {
    public int minSetSize(int[] arr) {
        if(arr == null || arr.length == 0) return 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->{
           return b.getValue() - a.getValue(); 
        });
        int size = arr.length;
        int result = 0,n = arr.length;
        for(Map.Entry<Integer,Integer> it: map.entrySet())
        {
            pq.offer(it);
        }
            while(size > n/2)
            {
                size -= pq.poll().getValue();
                result++;
            }
        
        
        return result;
        
    }
}