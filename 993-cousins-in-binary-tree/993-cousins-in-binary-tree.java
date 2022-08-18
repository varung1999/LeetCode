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
    TreeNode x_parent, y_parent;
    int x_level,y_level;
    
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        
        dfs(root,null,x,y,0);
        
        
        return x_level == y_level && x_parent!=y_parent;
    }
    
    private void dfs(TreeNode root, TreeNode prev, int x, int y, int level)
    {
        if(root == null) return;
        if(root.val == x)
        {
            x_level = level;
            x_parent = prev;
        }
        
        if(root.val == y)
        {
            y_level = level;
            y_parent = prev;
        }
        
        dfs(root.left,root,x,y,level+1);
        dfs(root.right,root,x,y,level+1);
    }
}