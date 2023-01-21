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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return helper(root,null,null);
        
    }
    
    private boolean helper(TreeNode root, Integer low, Integer high)
    {
        //base
        if(root == null) return true;
        
        //logic
        if((low!=null && root.val<=low) || (high!=null && root.val>=high))
        {
            return false;
        }
        
        return helper(root.right,root.val,high) && helper(root.left,low,root.val);
    }
}