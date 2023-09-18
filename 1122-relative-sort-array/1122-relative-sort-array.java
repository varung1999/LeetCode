class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        if(arr1 == null || arr2 == null) return new int[]{};
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i:arr1) map.put(i,map.getOrDefault(i,0)+1);
        
        int[] res = new int[arr1.length];
        int k = 0;
        for(int i = 0;i<arr2.length;i++)
        {
            int count = map.get(arr2[i]);
            while(count!=0)
            {
                count--;
                res[k++] = arr2[i];
            }
            map.remove(arr2[i]);
        }
        
        for(int key:map.keySet())
        {
            int val = map.get(key);
            while(val!=0){
                val--;
                res[k++] = key;
            }
            //map.remove(key);
        }
        return res;
    }
}