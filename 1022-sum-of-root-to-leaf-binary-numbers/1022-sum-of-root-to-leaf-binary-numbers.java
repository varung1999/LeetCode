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
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        if(root == null) return 0;
        
        dfs(root,new StringBuilder());
        return sum;
    }
    
    private void dfs(TreeNode root, StringBuilder path)
    {
        //base
        if(root == null) return;
        
        //logic
        path.append(root.val);
       

        dfs(root.left,path);
        dfs(root.right,path);
         if(root.left == null && root.right == null)
        {
            sum+= Integer.parseInt(path.toString(),2);
        }
        path.deleteCharAt(path.length()-1);
    }
}