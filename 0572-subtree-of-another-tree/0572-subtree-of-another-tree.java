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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        
        if(helper(root,subRoot)) return true;
        
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    
    private boolean helper(TreeNode node1, TreeNode node2)
    {
        //base
        if(node1 == null || node2 == null){
            return node1 == null && node2 == null;
        }
        
        return node1.val == node2.val && helper(node1.left,node2.left) && helper(node1.right,node2.right);
    }
}