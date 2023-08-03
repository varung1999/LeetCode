class Solution {
    List<String> result;
    List<String> map = new ArrayList<>(List.of("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));
    public List<String> letterCombinations(String digits) {
        result = new ArrayList<>();
        if(digits == null || digits.length() == 0) return result;
        
        backtracking(digits,"",0);
        
        return result;
    }
    
    private void backtracking(String digits, String path, int index)
    {
        //base
        if(digits.length() == path.length())
        {
            result.add(path);
            return;
        }
        
        //logic
        String currDigit = map.get(digits.charAt(index)-'0');
        
        for(int i = 0;i<currDigit.length();i++)
        {
            backtracking(digits,path+currDigit.charAt(i),index+1);
        }
    }
}