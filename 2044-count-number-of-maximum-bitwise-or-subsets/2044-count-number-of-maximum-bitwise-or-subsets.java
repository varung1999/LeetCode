class Solution {
    int count = 0;
    int max = 0;
    public int countMaxOrSubsets(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        backtrack(nums,0,0);
        
        return count+1;
    }
    
    private void backtrack(int[] nums, int index, int tempOr)
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
        backtrack(nums,index+1,tempOr);
        backtrack(nums,index+1,tempOr | nums[index]);
        
    }
}