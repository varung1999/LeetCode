class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        if(mat == null || mat.length == 0) return new int[]{};
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
           if(a[1] == b[1]) return b[0] - a[0];
            else return b[1] - a[1];
        });
        for(int i = 0;i<mat.length;i++)
        {
            
            int count = binarySearch(mat[i]);
            pq.add(new int[]{i,count});
            if(pq.size()>k) pq.poll();
        }
        
        int[] res = new int[k];
        for(int i = k-1;i>=0;i--)
        {
            int[] curr = pq.poll();
            res[i] = curr[0];
        }
        
        return res;
    }
    
    private int binarySearch(int[] mat)
    {
        int low = 0, high = mat.length - 1;
        
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            
            if(mat[mid] == 1)
            {
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        
        return low;
    }
}