class Solution {
    public int findCenter(int[][] edges) {
        if(edges == null || edges.length == 0) return 0;
        
       return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
}