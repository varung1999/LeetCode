class Solution {
    public int jump(int[] nums) {
        
        if(nums == null || nums.length<2) return 0;
        
        int jumps = 1;
        int curr = nums[0];
        int next = nums[0];
        
        for(int i = 0;i<nums.length;i++)
        {
            next = Math.max(next,i + nums[i]);
            if(i< nums.length-1 && i == curr)
            {
                jumps++;
                curr = next;
            }
        }
        
        return jumps;
        
    }
}