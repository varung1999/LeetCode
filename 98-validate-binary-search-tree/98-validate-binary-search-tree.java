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
    ArrayList<Integer> inOrder;
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        inOrder = new ArrayList<>();
        
        inorder(root);
        
        for(int i=1;i<inOrder.size();i++)
        {
            if(inOrder.get(i)<=inOrder.get(i-1))
            {
                return false;
            }
        }
        
        return true;
    }
    
    private void inorder(TreeNode root)
    {
        if(root == null) return ;
        
        inorder(root.left);
        inOrder.add(root.val);
        inorder(root.right);
    }
}