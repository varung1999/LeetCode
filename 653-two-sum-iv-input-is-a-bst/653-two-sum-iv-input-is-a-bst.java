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
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        
        HashMap<Integer,Boolean> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty())
        {
            TreeNode curr = q.poll();
            
            if(map.containsKey(k - curr.val)) return true;
            map.put(curr.val,true);
            
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
        }
        
        return false;
    }
}