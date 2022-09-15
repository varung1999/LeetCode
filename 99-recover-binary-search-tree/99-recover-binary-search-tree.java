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
    ArrayList<Integer> inorder;
    int index;
    public void recoverTree(TreeNode root) {
        if(root == null) return;
        inorder = new ArrayList<>();
        
        dfs(root);
        
        index = 0;
        Collections.sort(inorder);
        construct(root);
    }
    
    private void dfs(TreeNode root)
    {
        //base
        if(root == null) return;
        
        //logic
        dfs(root.left);
        inorder.add(root.val);
        dfs(root.right);
    }
    
    private void construct(TreeNode root)
    {
        //base
        if(root == null) return;
        
        //logic
        construct(root.left);
        root.val = inorder.get(index++);
        construct(root.right);
    }
}