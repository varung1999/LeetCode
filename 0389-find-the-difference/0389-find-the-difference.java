class Solution {
    public char findTheDifference(String s, String t) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        
        
        for(char c: t.toCharArray())
        {
            if(!map.containsKey(c)) return c;
            else{
                int val = map.get(c);
                val--;
                if(val == 0) map.remove(c);
                else{
                    map.put(c,val);
                }
            }
        }
        
        return 'c';
    }
}