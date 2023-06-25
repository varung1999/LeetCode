class Solution {
    public int[] nextGreaterElements(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
        
        int n = nums.length;
        
        int[] res = new int[n];
        
        for(int i = 0;i<n;i++)
        {
            boolean maxFound = false;
            for(int j = i+1;j<2*n;j++)
            {
                int index = j%n;
                
                if(nums[i]<nums[index])
                {
                    res[i] = nums[index];
                    maxFound = true;
                    break;
                }
            }
            
            if(!maxFound) res[i] = -1;
        }
        
        return res;
    }
}