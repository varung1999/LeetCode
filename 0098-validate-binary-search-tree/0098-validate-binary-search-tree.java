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
    ArrayList<Integer> list;
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        list = new ArrayList<>();
        inorder(root);
        
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)<=list.get(i-1)) return false;
        }
        return true;
    }
    
    private void inorder(TreeNode root){
        //base
        if(root == null) return;
        
        //logic
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}