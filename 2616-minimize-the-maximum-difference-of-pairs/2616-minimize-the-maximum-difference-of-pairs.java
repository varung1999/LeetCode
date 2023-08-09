class Solution {
    public int minimizeMax(int[] nums, int p) {
        if(nums == null || nums.length == 0) return 0;
        
        Arrays.sort(nums);
        
        int low = 0, high = nums[nums.length - 1] - nums[0];
        
        while(low<high)
        {
            int mid = low + (high - low)/2;
            
            if(canFormPairs(nums,mid,p)) high = mid;
            else low = mid + 1;
        }
        
        return low;
    }
    
    private boolean canFormPairs(int[] nums,int mid, int p)
    {
        int count = 0;
        
        for(int i = 0;i<nums.length - 1 ;)
        {
            if(nums[i+1] - nums[i]<=mid)
            {
                count++;
                i+=2;
            }
            else{
                i++;
            }
        }
        
        return count>=p;
    }
}