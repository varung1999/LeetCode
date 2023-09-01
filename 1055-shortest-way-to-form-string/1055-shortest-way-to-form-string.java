class Solution {
    public int shortestWay(String source, String target) {
        if(source == null || source.length() == 0) return 0;
        
        HashMap<Character,List<Integer>> map = new HashMap<>();
        
        for(int i =0;i<source.length();i++)
        {
            char c = source.charAt(i);
            if(!map.containsKey(c))
            {
                map.put(c,new ArrayList<>());
            }
            map.get(c).add(i);
        }
        
        int i = 0, pos = 0, t1 = target.length(), s1 = source.length(), result = 1;
        
        while(i<t1)
        {
            char c = target.charAt(i);
            if(!map.containsKey(c)) return -1;
            
            List<Integer> list = map.get(c);
            int k = Collections.binarySearch(list,pos);
            if(k<0) k = -k - 1;
            if(k == list.size()){
                pos = 0;
                result++;
            }
            else{
                pos = list.get(k) + 1;
                i++;
            }
            
        }
        
        return result;
    }
}