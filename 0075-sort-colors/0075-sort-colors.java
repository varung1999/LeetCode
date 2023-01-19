class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int two = 0, one = 0, zero = 0;
        
        for(int num:nums)
        {
            if(num == 0) zero++;
            else if(num == 1) one++;
            else two++;
        }
        
        int index = 0;
        while(index<nums.length)
        {
            while(zero>0){
                nums[index++] = 0;
                zero--;
            }
            
            while(one>0)
            {
                nums[index++] = 1;
                one--;
            }
            
            while(two>0)
            {
                nums[index++] = 2;
                two--;
            }
        }
        return;
    }
}