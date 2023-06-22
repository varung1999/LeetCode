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
    HashSet<Integer> set;
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        if(root1 == null || root2 == null) return false;
        
        set = new HashSet<>();
        dfs(root1);
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root2);
        while(!q.isEmpty())
        {
            TreeNode curr = q.poll();
            if(set.contains(target - curr.val)) return true;
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        
        return false;
    }
    
    private void dfs(TreeNode root)
    {
        //base
        if(root == null) return;
        
        dfs(root.left);
        set.add(root.val);
        dfs(root.right);
    }
}