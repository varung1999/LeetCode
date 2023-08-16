class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) return new int[]{};
        
        Deque<Integer> dq = new ArrayDeque<>();
        int[] res = new int[nums.length-k+1];
        
        for(int i = 0;i<nums.length;i++)
        {
            while(!dq.isEmpty() && dq.peekFirst()<i-k+1) dq.pollFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]) dq.pollLast();
            
            dq.offerLast(i);
            
            if(i>=k-1) res[i-k+1] = nums[dq.peekFirst()];
        }
        
        return res;
    }
}