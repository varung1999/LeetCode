class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        if(arr == null || arr.length == 0) return result;
        
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length - 1;i++)
        {
            int diff = Math.abs(arr[i+1] - arr[i]);
            min = Math.min(min,diff);
        }
        
        for(int i = 0;i<arr.length-1;i++)
        {
            if(arr[i+1] - arr[i] == min){
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                result.add(temp);
            }
        }
        
        return result;
    }
}