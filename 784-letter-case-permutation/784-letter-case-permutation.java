class Solution {
    List<String> result;
    public List<String> letterCasePermutation(String s) {
        result = new ArrayList<>();
        if(s == null || s.length() == 0) return result;
        
        backtrack(s,0,new StringBuilder());
        
        return result;
    }
    
    public void backtrack(String s, int index, StringBuilder temp)
    {
        //base
        if(temp.length() == s.length())
        {
            StringBuilder copy = new StringBuilder(temp);
            result.add(temp.toString());
            return;
        }
    
        //logic
        char curr = s.charAt(index);
        if(Character.isDigit(curr))
        {
            backtrack(s,index+1,temp.append(curr));
            temp.deleteCharAt(temp.length()-1);
        }
        
        else{
            temp.append(Character.toLowerCase(curr));
            backtrack(s,index+1,temp);
            temp.deleteCharAt(temp.length()-1);  
            temp.append(Character.toUpperCase(curr));
            backtrack(s,index+1,temp);
            temp.deleteCharAt(temp.length()-1);
        }
        
    }
}