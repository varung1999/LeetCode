class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
        
        int xor = 0;
        for(int i:nums)
        {
            xor^=i;
        }
        
        int temp = xor & (-xor);
        
        int xor2 = 0;
        
        for(int i:nums)
        {
            if((temp & i)!=0){
                xor2^=i;
            }
        }
        
        return new int[]{xor2, xor^xor2};
    }
}