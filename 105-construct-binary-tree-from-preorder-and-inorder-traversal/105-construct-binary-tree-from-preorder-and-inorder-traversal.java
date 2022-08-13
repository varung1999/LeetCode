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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null || preorder.length == 0 ) return null;
        
        int rootVal = preorder[0];
        int rootIdx = -1;
        for(int i =0;i<inorder.length;i++)
        {
            if(inorder[i]==rootVal)
            {
                rootIdx = i;
                break;
            }
        }
        
        TreeNode root = new TreeNode(rootVal);
        int[] inorderLeft = Arrays.copyOfRange(inorder,0,rootIdx);
        int[] inorderRight = Arrays.copyOfRange(inorder,rootIdx+1,inorder.length);
        
        int[] preorderLeft = Arrays.copyOfRange(preorder,1,rootIdx+1);
        int[] preorderRight = Arrays.copyOfRange(preorder,rootIdx+1,preorder.length);
        
        root.left = buildTree(preorderLeft,inorderLeft);
        root.right = buildTree(preorderRight,inorderRight);
        
        return root;
    }
}