class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        
        int result = Integer.MIN_VALUE;
        int left = 0, right = height.length - 1;
        while(left<right)
        {
            int min = Math.min(height[left],height[right]);
            result = Math.max(result,min * ( right - left));
            if(min == height[left]) left++;
            else right--;
        }
        
        return result;
    }
}