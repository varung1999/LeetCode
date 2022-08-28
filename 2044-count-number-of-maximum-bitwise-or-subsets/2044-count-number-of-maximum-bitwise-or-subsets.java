class Solution {
    int count = 0;
    int max = 0;
    public int countMaxOrSubsets(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        backtrack(nums,0,0,new ArrayList<>());
        
        return count+1;
    }
    
    private void backtrack(int[] nums, int index, int tempOr, ArrayList<Integer> path)
    {
        //base
        if(index == nums.length)
        {
            if(tempOr>max)
            {
                max = tempOr;
                count = 0;
            }
            else if(tempOr == max)
            {
                count++;
            }
            return;
        }
        
        //logic
        backtrack(nums,index+1,tempOr,path);
        path.add(nums[index]);
        backtrack(nums,index+1,tempOr | nums[index],path);
        path.remove(path.size()-1);
    }
}