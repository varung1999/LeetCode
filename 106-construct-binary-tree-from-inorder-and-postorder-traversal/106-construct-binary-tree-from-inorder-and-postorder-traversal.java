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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || inorder.length == 0 || postorder.length == 0) return null;
        
        int rootIdx = -1;
        int rootVal = postorder[postorder.length - 1];
        TreeNode root = new TreeNode(rootVal);
        
        for(int i =0;i<inorder.length;i++)
        {
            if(inorder[i]==rootVal){
                rootIdx = i;
                break;
            }
        }
        
        
        int[] inorderLeft = Arrays.copyOfRange(inorder,0,rootIdx);
        int[] inorderRight = Arrays.copyOfRange(inorder,rootIdx+1,inorder.length);
        int[] postorderLeft = Arrays.copyOfRange(postorder,0,rootIdx);
        int[] postorderRight = Arrays.copyOfRange(postorder,rootIdx,postorder.length  - 1);
        
        root.left = buildTree(inorderLeft,postorderLeft);
        root.right = buildTree(inorderRight,postorderRight);
        
        return root;
    }
}