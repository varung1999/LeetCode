class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        int count = 0;
        for(Integer val:map.values())
        {
            if(val%2==0) count+=val;
            else count+=val-1;
        }
        
        return count<s.length()?count+1:count;
        
    }
}