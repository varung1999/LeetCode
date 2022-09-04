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
    boolean ans;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        ans = false;
        backtrack(root,targetSum,0);
        
        return ans;
    }
    
    private void backtrack(TreeNode root, int target, int currSum)
    {
        //base
        if(root == null) return;
        
        if(root.left == null && root.right == null)
        {
            currSum += root.val;
            
            if(currSum == target)
            {
                ans = true;
            }
            return;
        }
        
        //logic
        backtrack(root.left,target,currSum+root.val);
        backtrack(root.right,target,currSum+root.val);
    }
}