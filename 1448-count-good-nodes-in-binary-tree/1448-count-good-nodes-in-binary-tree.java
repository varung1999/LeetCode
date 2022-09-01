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
    int count;
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        
        dfs(root.left,root.val);
        dfs(root.right,root.val);
        
        return count+1;
    }
    
    private void dfs(TreeNode root, int currMax)
    {
        //base
        if(root == null) return;
        //logic
        if(root.val>=currMax)
        {
            currMax = root.val;
            count++;
        }
        
        dfs(root.left,currMax);
        dfs(root.right,currMax);
    }
}