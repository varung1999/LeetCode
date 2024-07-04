class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr == null || arr.length == 0) return false;

        for(int i =0;i<arr.length-2;i++){
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0) return true;
        }
        return false;
    }
}