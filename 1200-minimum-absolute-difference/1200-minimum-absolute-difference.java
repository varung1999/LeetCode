class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        if(arr == null || arr.length == 0) return result;
        
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length - 1;i++)
        {
            int currMin = arr[i+1] - arr[i];
            
            if(currMin == min)
            {
                result.add(Arrays.asList(arr[i],arr[i+1]));
            }
            else if(currMin<min)
            {
                result.clear();
                result.add(Arrays.asList(arr[i],arr[i+1]));
                min = currMin;
            }
        }
        
        return result;
    }
}