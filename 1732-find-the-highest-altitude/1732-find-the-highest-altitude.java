class Solution {
    public int largestAltitude(int[] gain) {
        if(gain == null || gain.length == 0) return 0;
        int max = 0;
        for(int i =0;i<gain.length;i++)
        {
            if(i==0){
                max = Math.max(max,gain[i]);
               continue;
            }
            else{
                gain[i] = gain[i]+gain[i-1];
            }
                max = Math.max(max,gain[i]);
        }
        return max;
    }
}