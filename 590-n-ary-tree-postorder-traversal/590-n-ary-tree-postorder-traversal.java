/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> result;
    public List<Integer> postorder(Node root) {
        result = new ArrayList<>();
        if(root == null) return result;
        
        dfs(root);
        
        return result;
    }
    
    private void dfs(Node root){
        //base
        if(root == null) return;
        
        //logic
        for(Node child : root.children)
        {
            dfs(child);
        }
        
        result.add(root.val);
    }
}