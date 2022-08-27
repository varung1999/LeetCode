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
    List<String> result;
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return new ArrayList<>();
        
        result = new ArrayList<>();
        
        backtrack(root,"");
        
        return result;
    }
    
    private void backtrack(TreeNode root, String path)
    {
        //base
        if(root.left == null && root.right == null)
        {
            result.add(path+ root.val);
            return;
        }
        
        //logic
        if(root.left!=null){
            backtrack(root.left,path+root.val+"->");
        }
        if(root.right!=null){
            backtrack(root.right,path+root.val+"->");
        }
    }
}