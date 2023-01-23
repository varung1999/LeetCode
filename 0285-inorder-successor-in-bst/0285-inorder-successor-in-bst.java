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
    List<TreeNode> list;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root ==  null) return null;
        list = new ArrayList<>();
        dfs(root);
        
        for(int i =0;i<list.size();i++)
        {
            if(list.get(i) == p && i+1<list.size()) return list.get(i+1);
        }
        return null;
        
    }
    
    private void dfs(TreeNode root){
        if(root == null) return;
        
        dfs(root.left);
        list.add(root);
        dfs(root.right);
    }
}