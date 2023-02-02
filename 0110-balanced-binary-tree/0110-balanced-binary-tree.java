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
    boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return true;
        
        dfs(root);
        return ans;
    }
    
    private int dfs(TreeNode root)
    {
        if(root == null) return 0;
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        if(Math.abs(left-right)>1){
            ans = false;
            return 0;
        }
        
        return Math.max(left,right)+1;
    }
}