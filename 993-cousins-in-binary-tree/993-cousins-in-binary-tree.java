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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false; 
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level_x = -1;
        int level_y = -2;
        int depth = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i =0;i<size;i++)
            {
                TreeNode curr = q.poll();
                
                if(curr.left!=null && curr.right!=null)
                {
                    if(curr.left.val == x && curr.right.val == y) return false;
                    if(curr.right.val == x && curr.left.val == y) return false;
                }
                
                if(curr.val == x) level_x = depth;
                if(curr.val == y)level_y = depth;
                
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            
            depth++;
        }
        
        System.out.println(level_x +" "+level_y);
        return level_x==level_y;
    }
}