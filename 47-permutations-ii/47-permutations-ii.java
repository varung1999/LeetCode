class Solution {
    List<List<Integer>> result;
    HashSet<List<Integer>> set;
    public List<List<Integer>> permuteUnique(int[] nums) {
        result = new ArrayList<>();
        set = new HashSet<>();
        if(nums == null || nums.length == 0) return result;
        
        helper(nums,0,new boolean[nums.length],new ArrayList<>());
        
        return result;
    }
    
    private void helper(int[] nums, int index,boolean[] visited,ArrayList<Integer> temp)
    {
        //base
        if(index == nums.length)
        {
            if(!set.contains(new ArrayList<>(temp)))
            {
                set.add(new ArrayList<>(temp));
                result.add(new ArrayList<>(temp));
            }
            return;
        }
        
        //logic
        for(int i =0;i<nums.length;i++)
        {
            if(visited[i] == false)
            {
                visited[i] = true;
                temp.add(nums[i]);
                
                helper(nums,index+1,visited,temp);
                
                visited[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
}