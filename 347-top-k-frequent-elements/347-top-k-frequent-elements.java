class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i: nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
            max = Math.max(max,map.get(i));
        }
        
        List[] list = new List[max+1];
        
        for(int key: map.keySet())
        {
            int index = map.get(key);
            if(list[index] == null)
            {
                list[index] = new ArrayList<>();
                
            }
            list[index].add(key);
        }
        
        int[] result = new int[k];
        int x = 0;
        for(int i = max;i>=0 && k>=0;i--)
        {
            List<Integer> li = list[i];
            if(li!=null)
            {
                for(int j =0;x<k && j<li.size();j++)
                {
                    result[x] = li.get(j);
                    x++;
                }
            }
        }
        
        return result;
    }
}