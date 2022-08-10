class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        int c2 = 0,c1=0,c0=0;
        
        for(int i:nums)
        {
            if(i == 2) c2++;
            else if(i == 1) c1++;
            else if(i==0) c0++;
        }
        
        int index = 0;
        while(index<nums.length)
        {
            while(c0>0)
            {
                nums[index++] = 0;
                c0--;
            }
            
            while(c1>0)
            {
                nums[index++] = 1;
                c1--;
            }
            
            while(c2>0)
            {
                nums[index++] = 2;
                c2--;
            }
        }
        
        
    }
}