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
    List<Integer> list;
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return root;
        list = new ArrayList<>();
        
        dfs(root);
        
       TreeNode res = new TreeNode(0), curr = res;
        
        for(int val: list)
        {
            curr.right = new TreeNode(val);
            curr = curr.right;
        }
        
        return res.right;
    }
    
    private void dfs(TreeNode root)
    {
        //base
        if(root == null) return;
        
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}