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
        
        for(Map.Entry<Integer,List<Integer>> entry: map.entrySet())
        {
            int arrSize = entry.getKey();
            List<Integer> temp = entry.getValue();
            
            if(arrSize == temp.size()) result.add(temp);
            else{
                List<Integer> tempArray = new ArrayList<>(arrSize);
                for(int i = 0;i<temp.size();i++)
                {
                    if(tempArray.size()>=arrSize)
                    {
                        result.add(tempArray);
                        tempArray = new ArrayList<>(arrSize);
                    }
                    tempArray.add(temp.get(i));
                }
                if(!tempArray.isEmpty()) result.add(tempArray);
                
            }
        }
        
        return result;
    }
}