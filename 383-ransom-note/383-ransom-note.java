class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine == null || magazine.length() == 0) return false;
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i =0;i<magazine.length();i++)
        {
            char curr = magazine.charAt(i);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        
        for(int i =0;i<ransomNote.length();i++)
        {
            char curr = ransomNote.charAt(i);
            if(!map.containsKey(curr)) return false;
            
            int value = map.get(curr);
            value--;
            if(value<0) return false;
            
            map.put(curr,value);
        }
        
        return true;
    }
}