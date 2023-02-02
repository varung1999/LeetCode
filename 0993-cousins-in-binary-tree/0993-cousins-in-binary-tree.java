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
    TreeNode x_parent,y_parent;
    int x_level,y_level;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        
        dfs(root, null, x, y, 0);
        
        return x_level == y_level && x_parent!=y_parent;
    }
    
    private void dfs(TreeNode root, TreeNode parent, int x, int y, int lvl)
    {
        if(root == null) return;
        
        if(root.val == x)
        {
            x_parent = parent;
            x_level = lvl;
        }
        
        if(root.val == y)
        {
            y_parent = parent;
            y_level = lvl;
        }
        
        dfs(root.left,root,x,y,lvl+1);
        dfs(root.right,root,x,y,lvl+1);
    }
}