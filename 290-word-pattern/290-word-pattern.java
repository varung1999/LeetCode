class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] splitArray = s.split(" ");
        if(pattern.length()!=splitArray.length)
        {
            return false;
        }
        
       for(int i =0;i<splitArray.length;i++)
       {
            char currChar = pattern.charAt(i);
            String currString = splitArray[i];
           
           if(!map.containsKey(currChar) && set.contains(currString))
           {
               return false;
           }
           
           if(map.containsKey(currChar) && !currString.equals(map.get(currChar)))
           {
               
               return false;
           }
           
           map.put(currChar,currString);
           set.add(currString);
       }
        
        return true;
    }
}