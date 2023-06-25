class Solution {
    public int[] nextGreaterElements(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
        
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n*2-1;i>=0;i--)
        {
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i%n])
            {
                stack.pop();
            }
            
            if(stack.isEmpty()) res[i%n] = -1;
            else res[i%n] = nums[stack.peek()];
            
            stack.push(i%n);
        }
    return res;
    }
    
}