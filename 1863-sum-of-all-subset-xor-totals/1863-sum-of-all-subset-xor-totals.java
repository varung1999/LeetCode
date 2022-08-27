class Solution {
    int sum = 0;
    public int subsetXORSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        backtracking(nums,0,0);
        
        return sum;
    }
    
    private void backtracking(int nums[], int index,int temp)
    {
        //base
        if(index == nums.length)
        {
            sum+=temp;
            return;
        }
        //logic
        
        backtracking(nums,index+1,temp);
        int x = nums[index] ^ temp;
        backtracking(nums,index+1,x);
    }
}