class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;
        
        backtracking(nums,0,new boolean[nums.length],new ArrayList<>());
        
        return result;
    }
    
    private void backtracking(int[] nums,int index, boolean[] visited, ArrayList<Integer> temp)
    {
        //base
        if(index == nums.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        //logic
        for(int i =0;i<nums.length;i++)
        {
            if(visited[i] == false)
            {
                visited[i] = true;
                temp.add(nums[i]);
                backtracking(nums,index+1,visited,temp);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }
    }
    
}