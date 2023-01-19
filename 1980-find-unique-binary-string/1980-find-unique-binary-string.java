class Solution {
    String sb="";
    public String findDifferentBinaryString(String[] nums) {
        if(nums == null || nums.length == 0) return "";
        List<String> list = new ArrayList<>();
        for(String temp: nums) list.add(temp);
        helper(0,nums.length,list,"");
        
        return sb;
    }
    
    private void helper(int index, int n, List<String> list, String temp)
    {
        //base
        if(index>n) return;
        if(index == n)
        {
            if(!list.contains(temp)){
                sb=temp;
                return;
            }
        }
        
        //logic
        if(sb=="")
        {
            helper(index+1,n,list,temp+0);
            helper(index+1,n,list,temp+1);
        }
    }
}