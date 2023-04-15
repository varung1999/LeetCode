/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        
        
        while(root!=null)
        {
            int parent = root.val;
            
            if(p.val>parent && q.val>parent)
            {
                root = root.right;
            }
            else if(p.val<parent && q.val<parent)
            {
                root = root.left;
            }
            else{
                return root;
            }
        }
        
        return null;
    }
}