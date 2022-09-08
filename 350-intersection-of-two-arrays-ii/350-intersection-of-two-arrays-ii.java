class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) return new int[]{};
        
        if(nums2.length<nums1.length)
        {
            return intersect(nums2,nums1);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> result = new ArrayList<>();
        
        int low = 0, high = nums2.length - 1;
        for(int i =0;i<nums1.length;i++)
        {
            int bIndex = binarySearch(nums2,low,high, nums1[i]);
            
            if(bIndex != -1)
            {
                low = bIndex + 1;
                result.add(nums1[i]);
            }
        }
        
        int[] ans = new int[result.size()];
        int i =0;
        for(int num : result)
        {
            ans[i++] = num;
        }
        
        return ans;
    }
    
    private int binarySearch(int nums[], int low, int high, int target)
    {
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid]==target)
            {
                if(mid == low || nums[mid-1]<nums[mid])
                {
                    return mid;
                }
                high = mid - 1;
            }
            else if(nums[mid] <target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        
        return -1;
    }
}