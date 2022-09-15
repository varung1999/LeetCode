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
    TreeNode first;
    TreeNode second;
    TreeNode prev;
    public void recoverTree(TreeNode root) {
        if(root == null) return;
        dfs(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    
    private void dfs(TreeNode root)
    {
        //base
        if(root == null) return;
        //logic
        dfs(root.left);
        if(prev!=null && prev.val>=root.val)
        {
            if(first == null)
            {
                first = prev;
            }
            second = root;
        }
        prev = root;
        dfs(root.right);
    }
}