class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        List<Integer> order = new ArrayList<Integer>();
        backtrack(nums,0,order,result);
        return new ArrayList(result);
        
    }
    
    private void backtrack(int[] nums, int index, List<Integer> order, Set<List<Integer>> result)
    {
        //base
        if(index==nums.length)
        {
            if(order.size()>=2)
            {
                result.add(new ArrayList<>(order));
            }
            return;
        }
        
        //logic
        if(order.isEmpty() || order.get(order.size()-1)<=nums[index])
        {
            order.add(nums[index]);   
            backtrack(nums,index+1,order,result);
            order.remove(order.size()-1);
        }
        
        backtrack(nums,index+1,order,result);
    }
}