class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        
        HashSet<Character> set = new HashSet<>();
        int i =0,j=0;
        int max = Integer.MIN_VALUE;
        while(j<s.length())
        {
            if(set.contains(s.charAt(j)))
            {
                set.remove(s.charAt(i));
                i++;
            }
            else{
                set.add(s.charAt(j));
                j++;
                max = Math.max(max,set.size());
            }
        }
        
        return max;
    }
}