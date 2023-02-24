class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        
        HashSet<Character> set = new HashSet<>();
        int start = 0, end = 0;
        int max = Integer.MIN_VALUE;
        
        while(end<s.length())
        {
            if(!set.contains(s.charAt(end)))
            {
                set.add(s.charAt(end));
                end++;
                max = Math.max(max,set.size());
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}