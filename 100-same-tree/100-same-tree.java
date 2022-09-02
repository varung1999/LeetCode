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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //if(q == null || p == null || p.val!=q.val) return false;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);
        
        while(!queue.isEmpty())
        {
            q = queue.poll();
            p = queue.poll();
            
            if(p == null && q == null) continue;
            if(p == null || q == null) return false;
            if(p.val!=q.val) return false;
            
            queue.add(p.left);
            queue.add(q.left);
            queue.add(p.right);
            queue.add(q.right);
        }
        
        return true;
    }
    
   
}