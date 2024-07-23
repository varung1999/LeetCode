class Solution {
    public int[] frequencySort(int[] nums) {
        if(nums == null || nums.length == 0) return nums;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b)-> map.get(a).equals(map.get(b)) ? b - a : map.get(a) - map.get(b));
        
        int[] res = new int[nums.length];
        int index = 0;
        for(int i: list){
            int count = map.get(i);
            while(count>0){
                res[index++] = i;
                count--;
            }
        }
        
        return res;
    }
}