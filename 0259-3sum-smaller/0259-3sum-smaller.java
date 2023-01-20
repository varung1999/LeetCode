class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int sum = 0;
        //Doing Two Sum Smaller at every index
        //at each index -> target = target - nums[index]
        for(int i = 0;i<nums.length - 2;i++)
        {
            sum+=twoSumSmaller(nums,i+1,target-nums[i]);
        }
        return sum;
        
        
    }
    
    private int twoSumSmaller(int[] nums,int start, int target)
    {
        int sum = 0;
        int left = start;
        int right = nums.length - 1;
        
        while(left<right)
        {
            if(nums[left]+nums[right]<target)
            {
                sum+=right-left;
                left++;
            }
            else{
                right--;
            }
        }
        return sum;
    }
}