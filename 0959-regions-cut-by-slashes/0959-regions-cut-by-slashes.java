class Solution {
    public int regionsBySlashes(String[] grid) {
        int[][] arr = new int[grid.length*3][grid.length*3];
        
        for(int i = 0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[i].toCharArray().length;j++)
            {
                if(grid[i].charAt(j) == '/')
                {
                    arr[i*3][j*3+2]=1;
                    arr[i*3+1][j*3+1]=1;
                    arr[i*3+2][j*3]=1;
                }
                
                else if(grid[i].charAt(j)=='\\')
                {
                    arr[i*3][j*3]=1;
                    arr[i*3+1][j*3+1]=1;
                    arr[i*3+2][j*3+2]=1;
                }
            }
        }
        
        int count = 0;
        
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                if(arr[i][j]==0)
                {
                    dfs(arr,i,j);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private void dfs(int[][] arr, int r, int c)
    {
        if(r<0 || c<0 || r>=arr.length || c >= arr[0].length || arr[r][c] == 1) return;
        
        arr[r][c] = 1;
        
        dfs(arr,r+1,c);
        dfs(arr,r-1,c);
        dfs(arr,r,c-1);
        dfs(arr,r,c+1);
    }
}