class Solution {
    HashSet<Integer> set;
    public int[] numsSameConsecDiff(int n, int k) {
        set = new HashSet<>();
        
        for(int i =1;i<=9;i++)
        {
            dfs(i,n,k);
        }
        
        int[] result = new int[set.size()];
        int ind = 0;
        for(int i: set)
        {
            result[ind] = i;
            ind++;
        }
        
        return result;
    }
    
    private void dfs(int num,int n,int k)
    {
        //base
        int totalSize = String.valueOf(num).length();
        
        if(totalSize == n)
        {
            set.add(num);
            return;
        }
        
        //logic
        
        int lastDig = num%10;
        
        int plus = lastDig + k;
        int minus = lastDig - k;
        
        if(plus>=0 && plus<=9) 
        {
            dfs((num*10) + plus,n,k);
        }
        
        if(minus>=0 && minus<=9)
        {
            dfs((num*10) + minus, n,k);
        }
    }
}