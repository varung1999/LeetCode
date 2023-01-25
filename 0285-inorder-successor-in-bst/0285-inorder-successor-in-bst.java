/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode prev;
    TreeNode ans;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(p.right!=null)
        {
            TreeNode leftMost = p.right;
            
            while(leftMost.left!=null)
            {
                leftMost = leftMost.left;
            }
            
            ans = leftMost;
        }
        else{
            helper(root,p);
        }
        
        return ans;
    }
    
    private void helper(TreeNode root, TreeNode p)
    {
        if(root == null) return;
        
        helper(root.left,p);
        
        if(prev == p && ans == null)
        {
            ans = root;
            return;
        }
        
        prev = root;
        
        helper(root.right,p);
    }
}