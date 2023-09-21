class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) return 0;
        int n = nums1.length;
        int m = nums2.length;
        if(m<n) return findMedianSortedArrays(nums2,nums1);
        int low = 0, high = n;
        
        while(low<=high)
        {
            int nums1Partition = low + (high - low)/2;
            int nums2Partition = ((m+n)/2) - nums1Partition;
            
            double left1 = nums1Partition == 0 ? Integer.MIN_VALUE : nums1[nums1Partition-1];
            double left2 = nums2Partition == 0 ? Integer.MIN_VALUE : nums2[nums2Partition-1];
            
            double right1 = nums1Partition == n ? Integer.MAX_VALUE : nums1[nums1Partition];
            double right2 = nums2Partition == m ? Integer.MAX_VALUE : nums2[nums2Partition];
            
            if(left1<=right2 && left2<=right1){
                if((m+n)%2!=0) return Math.min(right1,right2);
                else return (Math.max(left1,left2) + Math.min(right1,right2))/2.0;
            }
            else if(left2>right1)
            {
                low = nums1Partition + 1;
            }
            else{
                high = nums1Partition - 1;
            }
        }
        
        return -1;
    }
}