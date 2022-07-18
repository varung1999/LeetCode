class Solution {
    
    HashMap<Character, Integer> map;
    public boolean isAlienSorted(String[] words, String order) {
        if(words == null || words.length == 0) return true;
        map = new HashMap<>();
        for(int i =0;i<order.length();i++)
        {
            char curr = order.charAt(i);
            map.put(curr,i);
        }
        
        
        for(int i =0;i<words.length - 1;i++)
        {
            String first = words[i];
            String second = words[i+1];
            
            if(helper(first,second))
            {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean helper(String first, String second)
    {
        for(int i =0;i<first.length() && i<second.length();i++)
        {
            char firstChar = first.charAt(i);
            char secondChar = second.charAt(i);
            
            if(firstChar!=secondChar)
            {
                return map.get(firstChar)>map.get(secondChar);
            }
        }
        
        return first.length()>second.length();
    }
}