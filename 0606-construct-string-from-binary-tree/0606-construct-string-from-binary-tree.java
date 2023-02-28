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
    StringBuilder sb;
    public String tree2str(TreeNode root) {
        sb = new StringBuilder();
        if(root == null) return sb.toString();
        
        helper(root);
        
        return sb.toString();
    }
    
    private void helper(TreeNode root){
        //base
        if(root == null) return;
        
        //logic
        sb.append(root.val);
        if(root.left == null && root.right == null) return;
        
        sb.append("(");
        helper(root.left);
        sb.append(")");
        if(root.right!=null){
            sb.append("(");
            helper(root.right);
            sb.append(")");
        }
    }
}