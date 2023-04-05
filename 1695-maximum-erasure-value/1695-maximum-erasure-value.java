class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int start = 0, end = 0;
        int res = 0, currSum = 0;
        HashSet<Integer> set = new HashSet<>();
        
        while(end<nums.length)
        {
            while(set.contains(nums[end]))
            {
                set.remove(nums[start]);
                currSum-=nums[start];
                start++;
            }
            
            currSum+=nums[end];
            set.add(nums[end]);
            res = Math.max(res,currSum);
            end++;
        }
        
        return res;
    }
}