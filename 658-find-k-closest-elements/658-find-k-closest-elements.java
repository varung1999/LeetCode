class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        if(arr == null || arr.length == 0) return result;
        
        int left = 0, right = arr.length - 1;
        
        while(right - left+ 1 > k)
        {
            int leftDiff = Math.abs(arr[left] - x);
            int rightDiff = Math.abs(arr[right] - x);
            
            if(leftDiff>rightDiff)
            {
                left++;
            }
            else{
                right--;
            }
        }
        
        for(int i = left;i<left + k;i++)
        {
            result.add(arr[i]);
        }
        return result;
    }
}