class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        
        int row = heights.length;
        int col = heights[0].length;
        
        boolean[][] pacific = new boolean[row][col];
        boolean[][] atlantic = new boolean[row][col];
        
        //top - down
        for(int i =0;i<col;i++)
        {
            dfs(heights,0,i,heights[0][i],pacific);
            dfs(heights,row-1,i,heights[row-1][i],atlantic);
        }
        
        //left - right
        for(int i =0;i<row;i++)
        {
            dfs(heights,i,0,heights[i][0],pacific);
            dfs(heights,i,col-1,heights[i][col-1],atlantic);
        }
        
        
        for(int i=0;i<row;i++)
        {
            for(int j =0;j<col;j++)
            {
                if(pacific[i][j] && atlantic[i][j])
                {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(i);
                    ans.add(j);
                    
                    result.add(ans);
                }
            }
        }
        
        return result;
        
    }
    
    private void dfs(int[][] heights, int r, int c, int prevHeight, boolean[][] visited)
    {
        if(r<0 || c<0 || r>=heights.length || c>=heights[0].length || prevHeight > heights[r][c] || visited[r][c])
        {
            return;
        }
        
        visited[r][c] = true;
        
        dfs(heights,r+1,c,heights[r][c],visited);
        dfs(heights,r-1,c,heights[r][c],visited);
        dfs(heights,r,c+1,heights[r][c],visited);
        dfs(heights,r,c-1,heights[r][c],visited);
    }
}