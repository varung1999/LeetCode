class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
        
        int[] temp = new int[nums.length];
        
        int j = 0, k = nums.length - 1;
        
        for(int i = 0;i<nums.length && j<nums.length && k>=0;i++)
        {
            if(nums[i]%2==0) temp[j++] = nums[i];
            else temp[k--] = nums[i];
        }
        
        return temp;
    }
}