class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        if(mat == null || mat.length == 0) return new int[]{};
        
        ArrayList<int[]> list = new ArrayList<>();
        Comparator<int[]> comparator = new Comparator<int[]>(){
            public int compare(int[] a, int[] b)
            {
                return a[1] == b[1] ? a[0] - b[0] : a[1] - b[1];
            }
        };
        
        for(int i = 0;i<mat.length;i++)
        {
            
            int count = binarySearch(mat[i]);
            list.add(new int[]{i,count});
        }
        Collections.sort(list,comparator);
        for(int[] temp: list)
        {
            System.out.println(temp[0] +" "+temp[1]);
        }
        
        int[] res = new int[k];
        for(int i = 0;i<k;i++)
        {
            int[] curr = list.get(i);
            res[i] = curr[0];
        }
        
        return res;
    }
    
    private int binarySearch(int[] mat)
    {
        int low = 0, high = mat.length - 1;
        
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            
            if(mat[mid] == 1)
            {
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        
        return low;
    }
}