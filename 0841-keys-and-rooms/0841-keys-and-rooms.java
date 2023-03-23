class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        while(!stack.isEmpty())
        {
            int curr = stack.pop();
            for(int child : rooms.get(curr))
            {
                if(!visited[child]){
                    visited[child] = true;
                    stack.push(child);
                }
            }
        }
        
        for(boolean x : visited) if(!x) return false;
        return true;
    }
}