class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int low = 0, high = nums.length - 1;
        int mid = 0;
        
        
        while(mid<=high)
        {
            if(nums[mid] == 2)
            {
                swap(nums,mid,high);
                high --;
            }
            else if(nums[mid] == 0)
            {
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
    
    private void swap(int[] nums,int first, int second)
    {
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}