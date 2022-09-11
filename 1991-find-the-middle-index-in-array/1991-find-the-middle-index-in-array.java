class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0,prefix = 0;
        for(int i:nums) sum+=i;
        for(int i = 0;i<nums.length;i++)
        {
            if(prefix == sum - prefix - nums[i]) return i;
            prefix+=nums[i];
        }
        return -1;
    }
}