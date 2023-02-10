class Solution {
    List<String> map = new ArrayList<>(List.of("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return ans;
        backtrack(digits,"",0);
        return ans;
    }
    
    private void backtrack(String digits, String path, int idx)
    {
        //base
        if(digits.length()==path.length())
        {
            ans.add(path);
            return;
        }
        
        //logic
        String currDigit = map.get(digits.charAt(idx)-'0');
        for(int i = 0;i<currDigit.length();i++)
        {
            backtrack(digits,path+currDigit.charAt(i),idx+1);
        }
    }
}