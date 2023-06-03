class Solution {
    int maxTime = Integer.MIN_VALUE;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for(int i = 0;i<n;i++)
        {
            list.add(new ArrayList<Integer>());
        }
        
        for(int i = 0;i<n;i++)
        {
            if(manager[i]!=-1)
            {
                list.get(manager[i]).add(i);
            }
        }
        
        dfs(list,informTime,headID,0);
        
        return maxTime;
    }
    
    private void dfs(ArrayList<ArrayList<Integer>> list, int[] informTime, int curr, int time)
    {
        maxTime = Math.max(maxTime,time);
        
        for(int child: list.get(curr))
        {
            dfs(list,informTime,child,time + informTime[curr]);
        }
    }
}