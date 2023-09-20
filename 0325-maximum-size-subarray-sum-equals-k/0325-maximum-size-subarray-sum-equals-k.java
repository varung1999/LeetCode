class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0, maxLength = 0;
        for(int i = 0;i<nums.length;i++)
        {
            sum+=nums[i];
            
            int complement = sum - k;
            if(complement == 0)
            {
                maxLength = i+1;
            }
            else if(map.containsKey(complement))
            {
                maxLength = Math.max(maxLength, i - map.get(complement));
            }
            
            map.putIfAbsent(sum,i);
        }
        return maxLength;
    }
}