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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        
        return dfs(root,root);
    }
    
    private boolean dfs(TreeNode root1, TreeNode root2)
    {
        //base
        if(root1 == null && root2 == null) return true;
        if(root1==null || root2 == null) return false;
        if(root1.val!=root2.val) return false;
        
        //logic
        boolean case1 = dfs(root1.left,root2.right);
        boolean case2 = dfs(root1.right,root2.left);
        
        return case1&&case2;
    }
}