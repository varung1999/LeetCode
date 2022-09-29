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
    List<Integer> result;
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return new ArrayList<>();
        result = new ArrayList<>();
        
        inorder(root1);
        inorder(root2);
        Collections.sort(result);
        return result;
    }
    
    private void inorder(TreeNode root)
    {
        //base
        if(root == null) return;
        
        //logic
        inorder(root.left);
        result.add(root.val);
        inorder(root.right);
    }
}