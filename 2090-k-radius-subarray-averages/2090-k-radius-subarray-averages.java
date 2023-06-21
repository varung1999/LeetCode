class Solution {
    public int[] getAverages(int[] nums, int k) {
        if(k == 0) return nums;
        
        int n = nums.length;
        
        int[] avg = new int[n];
        Arrays.fill(avg,-1);
        
        if(2*k+1>n) return avg;
        
       
        long[] prefixSum = new long[n+1];
        
        for(int i = 0;i<n;i++)
        {
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }
        
        //for(int i:prefixSum) System.out.print(i+" ");
        for(int i = k;i<n-k;i++)
        {
            int leftBound = i-k;
            int rightBound = i+k;
            
            long sum = prefixSum[rightBound+1] - prefixSum[leftBound];
            avg[i] = (int)(sum/(2*k+1));
        }
        
        return avg;
    }
}