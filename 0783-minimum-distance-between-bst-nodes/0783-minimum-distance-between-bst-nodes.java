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
    public int minDiffInBST(TreeNode root) {
        if(root == null) return 0;
        list = new ArrayList<>();
        
        dfs(root);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++)
        {
            min = Math.min(min, Math.abs(list.get(i+1)-list.get(i)));
        }
        
        return min;
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
}