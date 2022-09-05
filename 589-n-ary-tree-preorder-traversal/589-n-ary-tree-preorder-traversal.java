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
    public List<Integer> preorder(Node root) {
        result = new ArrayList<>();
        if(root == null) return result;
        
        dfs(root);
        
        return result;
    }
    
    private void dfs(Node root)
    {
        //base
        if(root == null) return;
        
        //logic
        result.add(root.val);
        for(Node child : root.children)
        {
            dfs(child);
        }
    }
}