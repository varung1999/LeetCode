class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        
        for(int i =0;i<s.length();i++)
        {
            char curr = s.charAt(i);
            if(set.contains(curr))
            {
                count+=1;
                set.remove(curr);
            }
            else{
                set.add(curr);
            }
        }
        
        if(!set.isEmpty()) return 2*count+1;
        return 2*count;
    }
}