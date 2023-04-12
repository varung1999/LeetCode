class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums) set.add(num);
        
        int max = 0;
        
        for(int num: nums)
        {
            if(!set.contains(num-1))
            {
                int currNum = num;
                int currStreak = 1;
                
                while(set.contains(currNum+1))
                {
                    currNum=currNum+1;
                    currStreak++;
                }
                
                max = Math.max(max,currStreak);
            }
        }
        
        return max;
    }
}