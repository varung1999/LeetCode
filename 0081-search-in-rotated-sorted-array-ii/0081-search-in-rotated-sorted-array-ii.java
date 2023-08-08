class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        
        while(low<=high && nums[low] == nums[high])
        {
            if(nums[low] == target) return true;
            low++;
            high--;
        }
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            System.out.println(mid);
            if(nums[mid] == target) return true;
            else if(nums[low]<=nums[mid])
            {
                if(target>=nums[low] && target<nums[mid])
                {
                    high = mid - 1;
                }
                else low = mid + 1;
            }
            else{
                if(nums[mid]<target && nums[high]>=target){
                    low = mid + 1;
                }
                else high = mid - 1;
            }
        }
        
        return false;
    }
}