class Solution {
    public int singleNumber(int[] nums) {
          if(nums == null || nums.length == 0) return 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i:nums)
        {
            if(set.contains(i))
            {
                set.remove(i);
            }
            else
            {
                set.add(i);
            }
        }
        
        return set.stream().findFirst().get();
    }
}