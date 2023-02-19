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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        
        dfs(root,0,result);
        
        return result;
    }
    
    private void dfs(TreeNode root, int level, List<Integer> result)
    {
        //base
        if(root == null) return;
        
        //logic
        if(level == result.size())
        {
            result.add(root.val);
        }
        else{
            result.set(level,Math.max(result.get(level),root.val));
        }
        
        dfs(root.left,level+1,result);
        dfs(root.right,level+1,result);
        
    }
}