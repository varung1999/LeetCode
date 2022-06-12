class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        int sum = 0, ans = 0;
        int j = 0,i=0;
        int n =  nums.length;
        while(i<n && j<n)
        {
            if(!set.contains(nums[j]))
            {
                sum+=nums[j];
                set.add(nums[j]);
                j++;
                ans = Math.max(ans,sum);
            }
            else
            {
                sum = sum-nums[i];
                set.remove(nums[i]);
                i++;
            }
        }
        
        return ans;
    }
}

/*
  
  TC = O(N)
  SC = O(N)

Approach: Since we need maximum sum possible using unique subarray, we will maintain hashset and add elements whenever we find a unique element,
If a repeated element is found, we remove that and compute accordingly.

*/
