class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;
        
        dfs(nums,0,new ArrayList<>());
        
        return result;
    }
    
    private void dfs(int[] nums, int index, ArrayList<Integer> temp)
    {
        //base
        
        //logic
        result.add(new ArrayList<>(temp));
        for(int i =index;i<nums.length;i++)
        {
            temp.add(nums[i]);
            dfs(nums,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}