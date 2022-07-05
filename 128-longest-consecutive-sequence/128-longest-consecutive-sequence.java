class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
       
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        
        int max = 0;
        
        for(int num: nums)
        {
            if(!set.contains(num-1))
            {
                int curr = num;
                int count = 1;
                
                
                while(set.contains(curr+1))
                {
                    curr=curr+1;
                    count++;
                }
                
                max = Math.max(count,max);
            }
        }
        
        return max;
    }
}