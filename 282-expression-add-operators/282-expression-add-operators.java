class Solution {
    List<String> result;
    public List<String> addOperators(String num, int target) {
        if(num == null || num.length() == 0) return new ArrayList<String>();
        result = new ArrayList<>();
        
        helper(num,target,0,0,0,"");
        return result;
    }
    
    private void helper(String num, int target, int index, long cal, long tail, String temp)
    {
        //base
        if(index == num.length())
        {
            if(cal == target)
            {
                result.add(temp);
                
            }
            return;
        }
        
        //logic
        for(int i = index; i<num.length();i++)
        {
            if(i!=index && num.charAt(index)=='0') continue;
            long curr = Long.parseLong(num.substring(index,i+1));
            if(index == 0)
            {
                helper(num,target,i+1,curr,curr,temp+curr);
            }
            else{
                //+ recursion
                helper(num,target,i+1,cal+curr,curr,temp+"+"+curr);
                //- recursion
                helper(num,target,i+1,cal-curr,-curr,temp+"-"+curr);
                //* recursion
                helper(num,target,i+1, (cal-tail)+(tail*curr),tail*curr,temp+"*"+curr);
            }
        }
    }
}