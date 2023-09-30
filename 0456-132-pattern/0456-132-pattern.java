class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length<3) return false;
        
        Stack<Integer> stack = new Stack<>();
        int maxThird = Integer.MIN_VALUE;
        
        
        for(int i = nums.length - 1;i>=0;i--)
        {
            int curr = nums[i];
            if(curr<maxThird) return true;
            
            while(!stack.isEmpty() && stack.peek()<curr) maxThird = stack.pop();
            stack.push(curr);
        }
        
        return false;
    }
}