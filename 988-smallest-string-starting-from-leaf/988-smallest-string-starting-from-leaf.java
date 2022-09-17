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
    String ans = "";
    public String smallestFromLeaf(TreeNode root) {
        if(root == null) return "";
        
        dfs(root, new StringBuilder());
        
        return ans;
    }
    
    private void dfs(TreeNode root, StringBuilder path)
    {
        //base
        if(root == null) return;
        
        
        //logic
        path.insert(0,(char)(root.val + 97));
        dfs(root.left,path);
        dfs(root.right,path);
        if(root.left == null && root.right == null)
        {
            if(ans == "")
            {
                ans = path.toString();
            }
            else{
                ans = ans.compareTo(path.toString()) > 0 ? path.toString() : ans;
            }
        }
        path.deleteCharAt(0);
    }
 }