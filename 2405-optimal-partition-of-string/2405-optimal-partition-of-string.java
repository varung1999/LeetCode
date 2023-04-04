class Solution {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        for(int i=0;i<s.length();i++)
        {
            char curr = s.charAt(i);
            
            if(!set.contains(curr))
            {
                set.add(curr);
            }
            else{
                set.clear();
                set.add(curr);
                ans++;
            }
        }
        
        if(!set.isEmpty())ans++;
        return ans;
    }
}