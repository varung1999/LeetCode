class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int ans = 0;
        int count = 0;
        int i = 0, j = 0;
        
        while(j<nums.length)
        {
            if(nums[j] == 0) count++;
            
            while(count==2)
            {
                if(nums[i] == 0)
                {
                    count--;
                }
                i++;
            }
            
            ans = Math.max(ans,j-i+1);
            
            j++;
        }
        
        return ans;
    }
}