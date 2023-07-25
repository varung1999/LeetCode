class Solution {
    public int findJudge(int n, int[][] trust) {
        //if(trust == null || trust.length == 0) return -1;
        
        int[] arr = new int[n+1];
        for(int i = 0;i<trust.length;i++)
        {
            int plus = trust[i][1];
            int minus = trust[i][0];
            
            arr[plus]++;
            arr[minus]--;
        }
        
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i] == n- 1) return i;
        }
        
        return -1;
    }
}