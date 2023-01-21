class Solution {
    public List<String> restoreIpAddresses(String s) {
        if(s == null || s.length() == 0) return new ArrayList<>();
        
        List<String> temp = new ArrayList<>();
        List<String> result = new ArrayList<>();
        
        backtrack(s,0,temp,result);
        return result;
    }
    
    private void backtrack(String s, int i, List<String> temp, List<String> result)
    {
        //base
        if(i == s.length())
        {
            if(temp.size()==4)
            {
                result.add(String.join(".",temp));
            }
            return;
        }
        
        //logic
        for(int j = i+1;j<=i+3 && j<=s.length();j++)
        {
            String tempInt = s.substring(i,j);
            
            if(Integer.parseInt(tempInt) <=255 && (tempInt.equals("0") || !tempInt.startsWith("0")))
            {
                temp.add(tempInt);
                
                backtrack(s,j,temp,result);
                
                temp.remove(temp.size()-1);
            }
        }
    }
}