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
    List<List<Integer>> result;
    public List<List<Integer>> findLeaves(TreeNode root) {
        result = new ArrayList<>();
        if(root == null) return result;
        
        height(root);
        
        return result;
    }
    
    private int height(TreeNode root)
    {
        //base
        if(root == null) return -1;
        
        int left = height(root.left);
        int right = height(root.right);
        
        int currHeight = Math.max(left,right)+1;
        
        if(currHeight == result.size())
        {
            result.add(new ArrayList<>());
        }
        
        result.get(currHeight).add(root.val);
        
        return currHeight;
    }
}