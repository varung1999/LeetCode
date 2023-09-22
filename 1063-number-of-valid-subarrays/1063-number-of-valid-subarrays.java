class Solution {
    public int validSubarrays(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 0;
        
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        
        for(int i = 0;i<nums.length;i++)
        {
            while(!stack.isEmpty() && nums[i]<nums[stack.peek()]){
                ans+= (i - stack.peek());
                stack.pop();
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty())
        {
            ans+= (nums.length - stack.peek());
            stack.pop();
        }
        
        return ans;
    }
}