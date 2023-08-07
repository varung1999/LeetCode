class Solution {
    public int mostFrequentEven(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int max = Integer.MIN_VALUE;
        boolean isFound = false;
        for(int i:nums) {
            max = Math.max(max,i);
            if(i%2==0) isFound = true;
        }
        
        if(!isFound) return -1;
        int[] count = new int[max+1];
        for(int i:nums) count[i]++;
        
        int maxCount = 0;
        for(int i =0;i<count.length;i+=2)
        {
            maxCount = Math.max(maxCount,count[i]);
        }
        
        int minNumber = Integer.MAX_VALUE;
        for(int i=0;i<count.length;i+=2)
        {
            if(count[i] == maxCount)
            {
                minNumber = Math.min(minNumber,i);
            }
        }
        
        return minNumber==Integer.MAX_VALUE?-1:minNumber;
    }
}