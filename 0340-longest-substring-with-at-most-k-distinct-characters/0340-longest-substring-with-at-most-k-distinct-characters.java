class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        if(n*k==0) return 0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        int start = 0, end = 0, max = 1;
        
        while(end<s.length())
        {
            map.put(s.charAt(end),end++);
            
            if(map.size()==k+1)
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