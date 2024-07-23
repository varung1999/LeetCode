class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        if(names == null || names.length == 0) return names;
        
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 0;i<names.length;i++){
            map.put(heights[i], names[i]);
        }
        
        Arrays.sort(heights);
        String[] res = new String[heights.length];
        int index = 0;
        for(int i = heights.length-1; i>=0;i--){
            res[index++] = map.get(heights[i]);
        }
        
        return res;
    }
}