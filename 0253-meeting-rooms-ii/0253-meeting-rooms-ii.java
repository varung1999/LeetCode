class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return 0;
        
        Arrays.sort(intervals,(a,b)-> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] inter: intervals)
        {
            if(pq.size()>0 && pq.peek()<=inter[0]) pq.poll();
            pq.add(inter[1]);
        }
        return pq.size();
    }
}