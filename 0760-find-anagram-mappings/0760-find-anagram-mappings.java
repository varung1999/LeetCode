class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        if(nums2==null || nums1 == null) return new int[]{};
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums2.length;i++)
        {
            map.put(nums2[i],i);
        }
        
        int[] res = new int[nums1.length];
        for(int i = 0;i<res.length;i++)
        {
            if(map.containsKey(nums1[i]))
            {
                res[i] = map.get(nums1[i]);
            }
        }
        
        return res;
    }
}