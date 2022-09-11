class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        if(ranges == null || ranges.length == 0) return false;
        int[] count = new int[51];
        for(int[] range : ranges)
        {
            int low = range[0];
            int high = range[1];
            
            for(int i = low;i<=high;i++)
            {
                count[i]++;
            }
        }
        
        for(int i = left;i<=right;i++)
        {
            if(count[i]==0) return false;
        }
        return true;
    }
}