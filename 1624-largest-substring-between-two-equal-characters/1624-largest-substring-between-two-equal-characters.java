class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        if(s == null || s.length() == 0) return -1;
        
        int max = Integer.MIN_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                max = Math.max(max,i-map.get(c)-1);
            }
            else{
                map.put(c,i);
            }
        }
        
        return max == Integer.MIN_VALUE? -1: max;
    }
}