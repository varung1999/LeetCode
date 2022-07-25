class Solution {
    public int shipWithinDays(int[] weights, int days) {
        if(weights == null || weights.length == 0) return 0;
        int low = 0, high = 0;
        for(int wt:weights)
        {
            low = Math.max(low,wt);
            high+=wt;
        }
        
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            int Days = 1;
            int currSum = 0;
            for(int i =0;i<weights.length;i++)
            {
                if(currSum+weights[i]>mid)
                {
                    Days++;
                    currSum=weights[i];
                }
                else{
                    currSum+=weights[i];
                }
            }
            
            if(days>=Days)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        
        return low;
    }
}