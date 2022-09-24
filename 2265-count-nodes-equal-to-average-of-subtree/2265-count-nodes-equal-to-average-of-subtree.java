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
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            TreeNode curr = q.poll();
            int height = getHeight(curr);
            int sum = getSum(curr);
            // System.out.println(curr.val +" "+height+" "+sum);
            if(curr.val == (sum/height)) count++;
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        
        return count;
    }
    
    private int getHeight(TreeNode curr)
    {
        //base
        if(curr == null) return 0;
        
        //logic
        return 1 + getHeight(curr.left) + getHeight(curr.right);
    }
    
    private int getSum(TreeNode root)
    {
        //base
        if(root == null) return 0;
        
        //logic
        int left = getSum(root.left);
        int right =getSum(root.right);
        
        return root.val + left + right;
    }
}