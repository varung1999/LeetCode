class Solution {
    public int equalPairs(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        int n = grid.length;
        int count = 0;
        
        Map<String,Integer> map = new HashMap<>();
        for(int[] row:grid)
        {
            String temp = Arrays.toString(row);
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        
        for(int c=0;c<n;c++)
        {
            int[] col = new int[n];
            for(int r = 0;r<n;r++)
            {
                col[r] = grid[r][c];
            }
            
            count+=map.getOrDefault(Arrays.toString(col),0);
        }
        
        return count;
    }
}