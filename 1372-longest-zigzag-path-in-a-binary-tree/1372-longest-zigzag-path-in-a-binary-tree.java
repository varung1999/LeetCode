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
    int max = Integer.MIN_VALUE;
    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;
        
        dfs(root,false,0);
        dfs(root,true,0);
        
        return max;
    }
    
    private void dfs(TreeNode root, boolean goLeft, int steps)
    {
        //base
        if(root == null) return;
        
        max = Math.max(steps,max);
        if(goLeft)
        {
            dfs(root.left,false,steps+1);
            dfs(root.right,true,1);
        }
        else{
            dfs(root.right,true,steps+1);
            dfs(root.left,false,1);
        }
    }
}