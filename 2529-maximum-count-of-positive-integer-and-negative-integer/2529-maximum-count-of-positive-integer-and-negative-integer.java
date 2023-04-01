class Solution {
    public int maximumCount(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        
        int pos = 0, neg = 0;
        for(int num:nums)
        {
            if(num>0) pos++;
            else if(num<0) neg++;
        }
        
        return Math.max(pos,neg);
    }
}