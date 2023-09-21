class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) return 0;
        int m = nums1.length;
        int n = nums2.length;
        
        int[] arr = new int[m+n];
        int k = 0;
        for(int i:nums1) arr[k++] = i;
        for(int i:nums2) arr[k++] = i;
        int length = arr.length;
        Arrays.sort(arr);
        double ans = 0;
        //System.out.print(arr[length/2] +" " +arr[(length-1)/2]);
        if(length%2==0){
            int num = (arr[length/2] + arr[(length-1)/2]);
            //System.out.println(num/2);
            ans = (double)num/2;
        }
        else ans = arr[length/2];
        
        return ans;
    }
}