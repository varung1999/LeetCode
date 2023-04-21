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
    public int findDistance(TreeNode root, int p, int q) {
        TreeNode lca = LCA(root,p,q);
        
        return helper(lca,p,0) + helper(lca,q,0);
        
    }
    
    private int helper(TreeNode root, int target, int step)
    {
        if(root == null) return -1;
        if(root.val == target) return step;
        int left = helper(root.left,target,step+1);
        
        if(left == -1)
        {
            return helper(root.right,target,step+1);
        }
        else{
            return left;
        }
    }
    
    private TreeNode LCA(TreeNode root, int p, int q)
    {
        if(root == null || root.val == p || root.val == q) return root;
        
        TreeNode left = LCA(root.left,p,q);
        TreeNode right = LCA(root.right,p,q);
        
        if(left == null && right == null) return null;
        else if(left == null) return right;
        else if(right == null) return left;
        else return root;
    }
}