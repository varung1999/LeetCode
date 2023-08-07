class Solution {
    public boolean canSplitArray(List<Integer> nums, int m) {
        if(nums == null || nums.size() == 0) return false;
        
        for(int i = 0;i<nums.size()-1;i++)
        {
            if(nums.get(i) +  nums.get(i+1)>=m) return true;
        }
        
        return nums.size()<3;
    }
}