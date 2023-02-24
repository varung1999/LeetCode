class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if(s.length()<3) return s.length();
        
        HashMap<Character,Integer> map = new HashMap<>();
        int start = 0, end = 0, max = 2;
        
        while(end<s.length())
        {
            map.put(s.charAt(end),end++);
            
            if(map.size()==3)
            {
                int del_index = Collections.min(map.values());
                
                map.remove(s.charAt(del_index));
                
                start = del_index+1;
            }
            
            max = Math.max(max,end - start);
        }
        return max;
    }
}