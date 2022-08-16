/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> result;
    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        if(root == null) return result;
        
        dfs(root);
        
        return result;
    }
    
    
    private void dfs(TreeNode root)
    {
        if(root == null) return;
        dfs(root.left);
        result.add(root.val);
        dfs(root.right);
        
    }
}