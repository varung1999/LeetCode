class Solution {
    public int minDeletions(String s) {
        if(s == null || s.length() == 0) return 0;
        //a - 1  b - 4   c - 1 e - 1
        
        char[] strArray = s.toCharArray();
        
        Arrays.sort(strArray);
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: strArray) map.put(c,map.getOrDefault(c,0)+1);
        
        HashSet<Integer> visited = new HashSet<>();
        
        int count = 0;
        for(char key: map.keySet())
        {
            int val = map.get(key);
            
            if(!visited.contains(val)) visited.add(val);
            else{
                while(visited.contains(val) && val>0)
                {
                    val--;
                    count++;
                }
                if(val>0) visited.add(val);
            }
        }
        return count;
    }
}