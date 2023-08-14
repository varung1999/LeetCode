class Solution {
    public int[][] kClosest(int[][] points, int k) {
        if(points == null || points.length == 0) return new int[][]{};
        
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<>(){
            public int compare(int[] left, int[] right)
            {
                return getDistance(right) - getDistance(left);
            }
        });
        
        for(int[] point:points)
        {
            pq.add(point);
            
            if(pq.size()>k) pq.poll();
        }
        
        
        
        int[][] res = new int[k][2];
        
        while(k>0)
        {
            res[--k] = pq.poll();
        }
        
        return res;
    }
    
    private int getDistance(int[] point)
    {
        return point[0] * point[0]  + point[1]*point[1];
    }
}