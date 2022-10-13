class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] trip = new int[1001];
        for(int[] tri:trips)
        {
            trip[tri[1]]+=tri[0];
            trip[tri[2]]-=tri[0];
        }
        
        int total = 0;
        
        for(int i =0;i<1001;i++)
        {
            total+=trip[i];
            
            if(total>capacity) return false;
        }
        
        return true;
    }
}