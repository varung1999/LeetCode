class NumArray {
    
    int[] numsArray;
    public NumArray(int[] nums) {
        numsArray = new int[nums.length + 1];
        for(int i = 0;i<nums.length;i++)
       {
           numsArray[i+1] = numsArray[i] + nums[i];
       }
    }
    
    public int sumRange(int left, int right) {
       
    
        return numsArray[right+1] - numsArray[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */