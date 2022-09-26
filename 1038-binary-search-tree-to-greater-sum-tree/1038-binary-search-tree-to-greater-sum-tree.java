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
    public TreeNode bstToGst(TreeNode root) {
        helper(root,0);
        return root;
    }
    
    private int helper(TreeNode root, int sum)
    {
        //base
        if(root == null) return 0;
        
        //logic
        int temp = root.val + helper(root.right,sum);
        root.val = sum + temp;
        temp += helper(root.left,root.val);
        return temp;
    }
}