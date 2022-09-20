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
    public int deepestLeavesSum(TreeNode root) {
        if(root == null) return 0;
        
        int maxDepth = depth(root);
        
        Queue<TreeNode> q = new LinkedList<>();
        int level = 1;
        q.add(root);
        int sum =0;
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i =0;i<size;i++)
            {
                TreeNode curr = q.poll();
                if(curr.left==null && curr.right == null && level == maxDepth) sum+=curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            level++;
        }
        
        return sum;
    }
    
    private int depth(TreeNode root)
    {
        //base
        if(root == null) return 0;
        //logic
        return 1 + Math.max(depth(root.left),depth(root.right));
    }
}