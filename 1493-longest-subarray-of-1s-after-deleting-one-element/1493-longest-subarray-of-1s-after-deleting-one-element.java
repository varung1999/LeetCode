class Solution {
    public int longestSubarray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int zeroCount = 0;
        int i=0,j=0, max = Integer.MIN_VALUE;
        
        boolean isFound=false;
        
        for(i = 0;i<nums.length;i++)
        {
            if(nums[i] == 0) {
                zeroCount++;
                isFound = true;
            }
            
            if(zeroCount>1)
            {
                while(zeroCount>1)
                {
                    if(nums[j]==0) zeroCount--;
                    j++;
                    //System.out.println(i-j);
                }
            }
            
            max = Math.max(max,i-j);
        }
        
        return isFound == true? max:nums.length-1; 
    }
}