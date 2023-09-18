class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        if(arr1 == null || arr2 == null) return new int[]{};
        
        int count[] = new int[1001];
        for(int i:arr1) count[i]++;
        
        int i = 0;
        for(int k:arr2)
        {
            while(count[k]-->0)
            {
                arr1[i++] = k;
            }
        }
        
        for(int k = 0;k<count.length;k++)
        {
            while(count[k]-->0) arr1[i++] = k;
        }
        
        return arr1;
        
    }
}