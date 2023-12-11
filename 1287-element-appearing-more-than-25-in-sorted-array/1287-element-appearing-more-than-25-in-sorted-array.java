class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr == null || arr.length == 0) return 0;
        
        int n = arr.length;
        int quarter = n/4;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int key: map.keySet())
        {
            if(map.get(key)>quarter) return key;
        }
        
        return -1;
    }
}