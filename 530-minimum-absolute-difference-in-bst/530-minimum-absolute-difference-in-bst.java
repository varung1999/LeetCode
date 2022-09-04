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
    ArrayList<Integer> preOrder;
    public int getMinimumDifference(TreeNode root) {
        preOrder = new ArrayList<>();
        
        dfs(root);
        
        if(preOrder.size()==1) return preOrder.get(0);
        int min = Integer.MAX_VALUE;
        for(int i = 1;i<preOrder.size();i++)
        {
            min = Math.min(min, Math.abs(preOrder.get(i-1)-preOrder.get(i)));
        }
        
        return min;
    }
    
    private void dfs(TreeNode root)
    {
        //base
        if(root == null) return;
        
        //logic
        dfs(root.left);
        preOrder.add(root.val);
        dfs(root.right);
    }
}