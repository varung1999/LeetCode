class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int low = 0, high = nums.length - 1;
        
        while(low<high)
        {
            int mid = low + (high - low)/2;
            
            boolean isEven = (high - mid)%2==0;
            
            if(nums[mid+1] == nums[mid]){
                if(isEven)
                {
                    low = mid + 2;
                }
                else{
                    high = mid - 1;
                }
            }
            else if(nums[mid - 1] == nums[mid])
            {
                if(isEven)
                {
                    high = mid - 2;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                return nums[mid];
            }
        }
        
        return nums[low];
    }
}