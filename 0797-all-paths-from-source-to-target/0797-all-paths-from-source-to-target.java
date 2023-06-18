class Solution {
    List<List<Integer>> result;
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        result = new ArrayList<>();
        if (graph == null || graph.length == 0) return result;
        
        int n = graph.length;
        List<List<Integer>> map = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < graph[i].length; j++) {
                row.add(graph[i][j]);
            }
            map.add(row);
        }
        
        dfs(map, 0, new ArrayList<>(), new boolean[n], n);
        
        return result;
    }
    
    private void dfs(List<List<Integer>> map, int curr, List<Integer> path, boolean[] visited, int size) {
        path.add(curr); // Add the current node to the path
        
        if (curr == size - 1) {
            result.add(new ArrayList<>(path)); // Reached the target node, add the current path to the result
        } else {
            for (int child : map.get(curr)) {
                if (!visited[child]) {
                    visited[child] = true; // Mark the child as visited
                    dfs(map, child, path, visited, size); // Recursive DFS traversal on the child node
                    visited[child] = false; // Backtrack: Mark the child as unvisited for other paths
                    path.remove(path.size() - 1); // Remove the current node from the path to backtrack
                }
            }
        }
    }
}
