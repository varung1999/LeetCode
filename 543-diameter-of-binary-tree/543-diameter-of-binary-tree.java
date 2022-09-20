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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        depth(root);
        return diameter;
    } 
    
    private int depth(TreeNode root)
    {
        if(root == null)
        return 0;
      int leftVal = depth(root.left);
      int rightVal = depth(root.right);
      diameter = Math.max(leftVal + rightVal, diameter);
      return Math.max(leftVal, rightVal) + 1;
    }
}