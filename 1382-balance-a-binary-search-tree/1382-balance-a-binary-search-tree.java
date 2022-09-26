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
    public TreeNode balanceBST(TreeNode root) {
        if(root == null) return null;
        list = new ArrayList<>();
        dfs(root);
        
        return sortedHelper(0,list.size()-1);
    }
    
        private void dfs(TreeNode root)
        {
            if(root == null) return;
            dfs(root.left);
            list.add(root.val);
            dfs(root.right);
        }
    
        private TreeNode sortedHelper(int start, int end)
        {
            if(start>end) return null;
            int mid = start + (end - start)/2;
            TreeNode root = new TreeNode(list.get(mid));
            root.left = sortedHelper(start,mid - 1);
            root.right = sortedHelper(mid+1,end);
            
            return root;
        }
}