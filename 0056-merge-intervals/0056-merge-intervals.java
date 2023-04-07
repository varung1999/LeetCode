class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return new int[][]{};
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        List<int[]> list = new ArrayList<>();
        int low = intervals[0][0];
        int high = intervals[0][1];
        
        for(int i = 1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=high)
            {
                if(high<intervals[i][1])
                {
                    high = intervals[i][1];
                }
            }
            else{
                list.add(new int[]{low,high});
                low = intervals[i][0];
                high = intervals[i][1];
            }
        }
        
        list.add(new int[]{low,high});
        return list.toArray(new int[0][]);
        
    }
}