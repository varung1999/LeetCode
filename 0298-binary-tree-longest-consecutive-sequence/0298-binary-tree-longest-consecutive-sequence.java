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
    int max = 0;
    public int longestConsecutive(TreeNode root) {
        dfs(root,null,0);
        
        return max;
    }
    
    private void dfs(TreeNode root, TreeNode parent, int length)
    {
        if(root == null) return;
        
        length = (parent!=null && root.val == parent.val+1) ? length+1 : 1;
        max = Math.max(max,length);
        dfs(root.left,root,length);
        dfs(root.right,root,length);
    }
}