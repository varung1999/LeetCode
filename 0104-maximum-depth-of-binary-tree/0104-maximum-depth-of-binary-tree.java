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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        
        return height(root,0);
    }
    
    private int height(TreeNode root, int level)
    {
        //base
        if(root == null) return 0;
        
        //logic
        int case1 = height(root.left,level+1);
        int case2 = height(root.right,level+1);
        
        return 1 + Math.max(case1,case2);
    }
}