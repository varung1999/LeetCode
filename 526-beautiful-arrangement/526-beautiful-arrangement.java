class Solution {
    
    int count = 0;
    
    public int countArrangement(int n) {
        if(n== 0 || n == 1) return n;
            
        backtracking(n,1, new int[n+1]);
        
        return count;
    }
    
    private void backtracking(int n, int index, int[] visited)
    {
        //base
        if(index>n)
        {
            count++;
            return;
        }
        
        //logic
        
        for(int i =1;i<=n;i++)
        {
            if(visited[i]==0 && (i%index == 0 || index%i == 0))
            {
                visited[i] = 1;
                
                backtracking(n,index+1,visited);
                
                visited[i] = 0;
            }
        }
    }
}