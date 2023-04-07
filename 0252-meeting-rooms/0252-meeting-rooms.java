class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return true;
        
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        
        for(int i = 0;i<intervals.length-1;i++)
        {
            int currLow = intervals[i][0];
            int currHigh = intervals[i][1];
            
            int nextLow = intervals[i+1][0];
            int nextHigh = intervals[i+1][1];
            
            if(currHigh>nextLow) return false;
        }
        
        return true;
    }
}