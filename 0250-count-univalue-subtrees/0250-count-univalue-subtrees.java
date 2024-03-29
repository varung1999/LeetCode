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
    int count = 0;
    public int countUnivalSubtrees(TreeNode root) {
        if(root == null) return 0;
        
        dfs(root);
        return count;
    }
    
    private boolean dfs(TreeNode root)
    {
        //base
        if(root == null) return true;
        
        //logic
        
        boolean left = dfs(root.left);
        boolean right = dfs(root.right);
        
        if(left && right)
        {
            if(root.left!=null && root.left.val!=root.val) return false;
            if(root.right!=null && root.right.val!=root.val) return false;
            
            count++;
            return true;
        }
        
        return false;
    }
}