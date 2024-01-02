class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 1;
        for(int i = 0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else{
                int val = map.get(nums[i]);
                val++;
                max = Math.max(max,val);
                map.put(nums[i],val);
            }
        }
        
        for(int i = 0;i<max;i++)
        {
            result.add(new ArrayList<>()); 
        }
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            int currKey = entry.getKey();
            int currVal = entry.getValue();
            
            int i = 0;
            while(currVal>0)
            {
                if(i == result.size()) i = 0;
                result.get(i++).add(currKey);
                currVal--;
            }
        }
        
        return result;
    }
}