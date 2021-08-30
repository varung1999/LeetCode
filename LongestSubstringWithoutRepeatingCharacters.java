import java.util.*;
class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max = 0;
        
        HashSet<Character> set = new HashSet<>();
        
        while(end<s.length()){
            if(!set.contains(s.charAt(end)))
            {
                set.add(s.charAt(end));
                end++;
                max = Math.max(set.size(),max);
            }
            else
            {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1) -> worst case the hashSet will have all the elements. So 26 characters it is. Hence constant space complexity
