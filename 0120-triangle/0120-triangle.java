class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0) return 0;
        
        int n = triangle.size();
        for(int i = n-2;i>=0;i--)
        {
            for(int j = 0;j<=i;j++)
            {
                int min = Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1));
                triangle.get(i).set(j,min+triangle.get(i).get(j));
            }
        }
        
        return triangle.get(0).get(0);
    }
}