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
    int ans;
    int count =  0;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        
        dfs(root,k);
        return ans;
    }
    
    private void dfs(TreeNode root, int k)
    {
        //base
        if(root == null) return;
        
        dfs(root.left,k);
        count++;
        if(count == k) {
            ans = root.val;
            return;
        }
        
        dfs(root.right,k);
    }
}