class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:arr) set.add(x);
        
        int ans = 0;
        for(int i =0;i<arr.length;++i)
        {
            for(int j = i+1;j<arr.length;++j)
            {
                int a = arr[j];
                int b = arr[i] + arr[j];
                
                int length = 2;
                while(set.contains(b))
                {
                    int temp = b;
                    b+=a;
                    //System.out.println(b);
                    a = temp;
                    
                    ans = Math.max(ans,++length);
                }
            }
        }
        
        if(ans>=3) return ans;
        return 0;
    }
}