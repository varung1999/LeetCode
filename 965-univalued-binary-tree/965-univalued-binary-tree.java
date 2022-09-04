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
    boolean ans;
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        ans = true;
        dfs(root,root.val);
        return ans;
    }
    
    private void dfs(TreeNode root, int value)
    {
        //base
        if(root == null) return;
        
        if(root.val != value)
        {
            ans = false;
            return;
        }
        
        //logic
        dfs(root.left,value);
        dfs(root.right,value);
    }
}