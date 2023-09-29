class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums == null || nums.length == 0) return true;
        
        Stack<Integer> stack = new Stack<>();
        boolean isIncreasing = true;
        
        for(int i:nums)
        {
            if(!stack.isEmpty() && stack.peek()>i){
                isIncreasing = false;
                break;
            }
            stack.push(i);
        }
        
        stack = new Stack<>();
        boolean isDecreasing = true;
        
        for(int i:nums)
        {
            if(!stack.isEmpty() && stack.peek()<i){
                isDecreasing = false;
                break;
            }
            stack.push(i);
        }
        
        return isIncreasing | isDecreasing;
    }
}