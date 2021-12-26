//Time Complexity: O(n)

class Solution {
    public int minimumDeletions(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num < min) {
                min = num;
                minIndex = i;
            }
            if (num > max) {
                max = num;
                maxIndex = i;
            }
        }
        int n = nums.length;
        int minimum = Math.min(minIndex, maxIndex);
        int maximum = Math.max(minIndex, maxIndex);
        int both = minimum  + (n - maximum) + 1;
        int front = maximum + 1;
        int back = n - minimum;
        return Math.min(Math.min(both, front), back);
    }
}
