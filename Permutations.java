class Solution {
    
    List<List<Integer>> list = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        
        List<Integer> dt = new LinkedList<>();
        
        for(int num:nums)
        {
            dt.add(num);
        }
        
        helper(new LinkedList<>(),dt);
        return list;
        
    }
    
    
    private void helper(List<Integer> permutation, List<Integer> dt)
    {
        if(dt.size()==0)
        {
            list.add(permutation);
            return;
        }
        
        for(Integer num:dt)
        {
            List<Integer> tempPerm = new LinkedList<>(permutation);
            List<Integer> tempDt = new LinkedList<>(dt);
            
            tempPerm.add(num);
            tempDt.remove(num);
            
            helper(tempPerm, tempDt);
        }
    }
}
