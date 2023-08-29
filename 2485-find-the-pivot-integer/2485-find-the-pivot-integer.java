class Solution {
    public int pivotInteger(int n) {
        if(n == 0 || n == 1) return n;
        
        int[] first = new int[n+1];
        int sum = 0;
        for(int i = 0;i<first.length;i++)
        {
            sum+=i;
            first[i] = sum;
        }
        
        sum = 0;
        int[] last = new int[n+1];
        for(int i = n;i>=0;i--)
        {
            sum+=i;
            last[i] = sum;
        }
        
        for(int i = 0;i<first.length;i++){
            if(first[i] == last[i]) return i;
        }
        
        return -1;
    }
}