class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) return new int[]{};
        
        int m = nums1.length;
        int n = nums2.length;
        if(n<m) return intersect(nums2,nums1);
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> res = new ArrayList<>();
        int low = 0, high = nums2.length - 1;
        for(int i = 0;i<m;i++)
        {
            int bIndex = binarySearch(low,high,nums2,nums1[i]);
            
            if(bIndex!=-1)
            {
                low = bIndex+1;
                res.add(nums1[i]);
            }
        }
        
        int[] ans = new int[res.size()];
        
        for(int i = 0;i<ans.length;i++)
        {
            ans[i]=res.get(i);
        }
        
        return ans;
    }
    
    private int binarySearch(int l, int h, int nums2[], int target)
    {
        int low = l, high = h;
        
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            
            if(nums2[mid]==target)
            {
                if(mid == low || nums2[mid-1]<nums2[mid])
                {
                    return mid;
                }
                high = mid - 1;
            }
            else if(nums2[mid]<target)
            {
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return -1;
    }
}