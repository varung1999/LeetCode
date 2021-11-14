class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int lower = BinarySearch(nums,target,true);
        int higher = BinarySearch(nums,target,false)-1;
        
        if(lower<nums.length && lower<=higher && nums[lower]==target && nums[higher]==target)
        {
            return new int[]{lower,higher};
        }
        
        return new int[]{-1,-1};
        
    }
    
    
    public static int BinarySearch(int[] arr,int target,boolean small)
    {
        int left = 0,right = arr.length-1;
        int n= arr.length;
        
        while(left<=right)
        {
            int mid = left + (right - left)/2;
            
            if(arr[mid]> target  || (small && arr[mid]>=target))
            {
                right = mid - 1;
                n=mid;
            }
            else
            {
                left = mid + 1;
                
            }
        }
        return n;
    }
}
