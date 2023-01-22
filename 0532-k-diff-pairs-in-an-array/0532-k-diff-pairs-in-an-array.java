class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        
        Set<List<Integer>> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            int diff1 = nums[i] - k;
            int diff2 = nums[i] + k;
            
            if(map.containsKey(diff1))
            {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(diff1);
                Collections.sort(temp);
                if(!set.contains(temp) && map.get(diff1)!=i)
                {
                    set.add(temp);
                }
            }
            
            if(map.containsKey(diff2))
            {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(diff2);
                Collections.sort(temp);
                if(!set.contains(temp) && map.get(diff2)!=i)
                {
                    set.add(temp);
                }
            }
        }
        
        return set.size();
    }
}