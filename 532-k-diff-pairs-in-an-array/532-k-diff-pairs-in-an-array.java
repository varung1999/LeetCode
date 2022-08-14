class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        
        HashSet<List<Integer>> set = new HashSet<>();
        
        for(int i =0;i<nums.length;i++)
        {
            int curr = nums[i];
            List<Integer> temp = new ArrayList<>();
            
            if(map.containsKey(curr-k))
            {
                temp.add(curr);
                temp.add(curr-k);
                
                Collections.sort(temp);
                if(map.get(curr-k)!=i) set.add(temp);
            }
            
            temp = new ArrayList<>();
            
            if(map.containsKey(curr+k))
            {
                temp.add(curr);
                temp.add(curr+k);
                
                Collections.sort(temp);
                if(map.get(curr+k)!=i) set.add(temp);
            }
        }
        
        return set.size();
    }
}