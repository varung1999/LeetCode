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
    int i = 0;
    public void recoverTree(TreeNode root) {
        if(root == null) return;
        
        list = new ArrayList<>();
        dfs(root);
        
        Collections.sort(list);
        
        helper(root);
    }
    
    private void dfs(TreeNode root)
    {
        //base
        if(root == null) return;
        
        //logic
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
    
    private void helper(TreeNode root)
    {
        //base
        if(root == null) return;
        //logic
        helper(root.left);
        root.val = list.get(i);
        i++;
        helper(root.right);
    }
}