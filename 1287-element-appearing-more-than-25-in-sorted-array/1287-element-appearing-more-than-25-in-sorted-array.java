class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr == null || arr.length == 0) return 0;
        
        int n = arr.length;
        int quarter = n/4;
        
        
        int count = 1, res = -1;
        
        for(int i = 1;i<n;i++)
        {
            if(arr[i-1] == arr[i])
            {
                count++;
                if(count>quarter) return arr[i];
            }
            else{
                count = 1;
            }
        }
        
        return arr[0];
    }
}