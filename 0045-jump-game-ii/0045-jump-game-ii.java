class Solution {
    public int jump(int[] nums) {
        int count = 0;
        
        int currFar = 0, currEnd = 0;
        for(int i = 0;i<nums.length - 1;i++)
        {
            currFar = Math.max(currFar,i+nums[i]);
            
            if(i == currEnd)
            {
                count++;
                currEnd = currFar;
            }
        }
        
        return count;
    }
}