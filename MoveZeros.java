class Solution {
    public void moveZeroes(int[] nums) {
        
        int count = 0;
        for(int i:nums)
        {
            if(i!=0)
            {
                nums[count++]=i;
            }
        }
        
        for(int j = count;j<nums.length;j++)
        {
            nums[j]=0;
        }
        
    }
}
