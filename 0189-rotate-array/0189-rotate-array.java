class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0) return;
        k = k % nums.length;
        reverse(nums,0,nums.length - 1);
        //System.out.println("1 finished");
        reverse(nums,0,k-1);
        //System.out.println("2 finished");
        reverse(nums,k,nums.length - 1);
       // System.out.println("3 finished");
        
    }
    
    private void reverse(int nums[], int i, int j)
    {
        while(i<j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}