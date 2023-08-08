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
    List<Integer> values;
    public int closestValue(TreeNode root, double target) {
        values = new ArrayList<>();
        if(root == null) return 0;
        
        dfs(root);
        
        return Collections.min(values, new Comparator<Integer>(){
            public int compare(Integer a, Integer b)
            {
                return Math.abs(a - target) < Math.abs(b - target) ? -1 : 1;
            }
        });
    }
    
    private void dfs(TreeNode root)
    {
        //base
        if(root == null) return;
        
        //logic
        dfs(root.left);
        values.add(root.val);
        dfs(root.right);
    }
}