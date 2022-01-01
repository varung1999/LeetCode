class Solution {
    
    
    public Map<Character, char[]> map = Map.of(

            '2', "abc".toCharArray(),

            '3', "def".toCharArray(),

            '4', "ghi".toCharArray(),

            '5', "jkl".toCharArray(),

            '6', "mno".toCharArray(),

            '7', "pqrs".toCharArray(),

            '8', "tuv".toCharArray(),

            '9', "wxyz".toCharArray()

    );
    
    
    public List<String> letterCombinations(String digits) {
        
        if(digits.length()==0)
        {
            return new ArrayList<>();
        }
        
        List<String> ans = new ArrayList<>();
        helper(new StringBuilder(),digits.toCharArray(),ans);
        return ans;
        
    }
    
    
    private void helper(StringBuilder sb, char[] digits, List<String> ans)
    {
        if(sb.length()==digits.length)
        {
            ans.add(sb.toString());
            return;
        }
        
        char next = digits[sb.length()];
        
        for(char c: map.get(next))
        {
            sb.append(c);
            helper(sb,digits,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
