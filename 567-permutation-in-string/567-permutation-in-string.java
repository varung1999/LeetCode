class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1 == null || s2 == null || s1.length() > s2.length()) return false;
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s1.length();i++)
        {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i),0)+1);
        }
        
        int match = 0;
        
        for(int i =0;i<s2.length();i++)
        {
            char in = s2.charAt(i);
            if(map.containsKey(in))
            {
                int val = map.get(in);
                val--;
                if(val == 0)
                {
                    match++;
                }
                map.put(in,val);
            }
            
            if(i>=s1.length())
            {
                char out = s2.charAt(i - s1.length());
                if(map.containsKey(out))
                {
                    int val = map.get(out);
                    val++;
                    if(val == 1)
                    {
                        match --;
                    }
                    map.put(out,val);
                }
            }
            if(match == map.size()) return true;
        }
        return false;
    }
}