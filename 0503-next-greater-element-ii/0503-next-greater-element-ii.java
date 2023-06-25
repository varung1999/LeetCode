class Solution {
    public int[] nextGreaterElements(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
        
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,-1);
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0;i<2*n;i++)
        {
            while(!stack.isEmpty() && nums[i%n]>nums[stack.peek()])
            {
                res[stack.peek()] = nums[i%n];
                stack.pop();
            }
            
            if(i<n) stack.push(i);
        }
        
        return res;
    }
    
}