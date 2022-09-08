class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int i:nums1) set1.add(i);
        HashSet<Integer> set2 = new HashSet<>();
        for(int i:nums2) set2.add(i);
        
        set1.retainAll(set2);
        int[] res = new int[set1.size()];
        int i =0;
        for(int num : set1)
        {
            res[i++] = num;
        }
        
        return res;
    }
}