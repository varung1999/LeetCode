class Solution {
    
    HashMap<Integer,Integer> map = new HashMap<>();
    
    public int numDecodings(String s) {
        return helper(0,s);    
    }
    
    private int helper(int idx, String str)
    {
        //base
        if(map.containsKey(idx)) return map.get(idx);
        
        if(idx == str.length()) return 1;
        
        //logic
        if(str.charAt(idx)=='0') return 0;
        
        if(idx == str.length()-1) return 1;
        
        int ans = helper(idx+1,str);
        if(Integer.parseInt(str.substring(idx,idx+2))<=26) ans+=helper(idx+2,str);
        
        map.put(idx,ans);
        
        return ans;
    }
}