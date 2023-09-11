class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        if(groupSizes == null || groupSizes.length == 0) return result;
        
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i = 0;i<groupSizes.length;i++)
        {
            if(!map.containsKey(groupSizes[i]))
            {
                map.put(groupSizes[i],new ArrayList<>());
            }
            map.get(groupSizes[i]).add(i);
        }
        
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int arrSize = entry.getKey();
            List<Integer> temp = entry.getValue();
            for (int i = 0; i < temp.size(); i += arrSize) {
                result.add(temp.subList(i, Math.min(i + arrSize, temp.size())));
            }
        }
        
        return result;
    }
}