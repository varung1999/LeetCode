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
    List<List<Integer>> result;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        result = new ArrayList<>();
        if(root == null) return result; 
        
        dfs(root,0,new ArrayList<>());
        
        return result;
    }
    
    private void dfs(TreeNode root, int level, ArrayList<Integer> path)
    {
        //base
        if(root == null) return;
        if(level==result.size())
        {
            ArrayList<Integer> temp = new ArrayList<>();
            result.add(temp);
        }
        
        
        //logic
        if(level%2!=0)
        {
            result.get(level).add(0,root.val);
        }
        else{
            result.get(level).add(root.val);
        }
        
        dfs(root.left,level+1,path);
        dfs(root.right,level+1,path);
    }
}