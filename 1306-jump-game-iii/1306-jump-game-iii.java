class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        
        while(!q.isEmpty())
        {
            int node = q.poll();
            
            if(arr[node]==0) return true;
            if(arr[node]<0) continue;
            
            if(node + arr[node]<arr.length)
            {
                q.add(node+arr[node]);
            }
            
            if(node - arr[node]>=0)
            {
                q.add(node - arr[node]);
            }
            
            arr[node] = - arr[node];
        }
        
        return false;
    }
}