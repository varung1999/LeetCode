class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr == null || arr.length <= 2) return true;
        
        Arrays.sort(arr);
        int diff = Math.abs(arr[1]-arr[0]);
        for(int i=2;i<arr.length;i++)
        {
            if(Math.abs(arr[i-1] - arr[i])!=diff) return false;
        }
        
        return true;
    }
}