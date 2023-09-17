class Solution {
    public int countWays(List<Integer> nums) {
        if(nums == null || nums.size() == 0) return 0;
        
        Collections.sort(nums);
        int count = 0;
        for(int i = 0;i<nums.size();i++)
        {
            if(i == nums.size() - 1 && i+1>nums.get(i)) count++;
            else {
                if (i+1>nums.get(i) && i+1<nums.get(i+1)) count++;
            }
        }
        
        return nums.get(0) > 0 ? count+1:count;
    }
}