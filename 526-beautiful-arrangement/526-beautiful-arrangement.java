class Solution {
    
    int count = 0;
    
    public int countArrangement(int n) {
        if(n== 0 || n == 1) return n;
            
        backtracking(n,1, new boolean[n+1]);
        
        return count;
    }
    
    private void backtracking(int n, int index, boolean[] visited)
    {
        //base
        if(index>n)
        {
            count++;
            
        }
        
        //logic
        
        for(int i =1;i<=n;i++)
        {
            if(visited[i]==false && (i%index == 0 || index%i == 0))
            {
                visited[i] = true;
                
                backtracking(n,index+1,visited);
                
                visited[i] = false;
            }
        }
    }
}