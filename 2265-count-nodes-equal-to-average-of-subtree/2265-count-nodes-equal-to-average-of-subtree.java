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
    
    class NodeInfo{
        int sum,size;
        
        public NodeInfo(int sum,int size)
        {
            this.sum = sum;
            this.size = size;
        }
    }
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        if(root == null) return 0;
        dfs(root);
        return count;
    }
    
    private NodeInfo dfs(TreeNode root)
    {
        //base
        if(root == null) return new NodeInfo(0,0);
        
        //logic
        NodeInfo left = dfs(root.left);
        NodeInfo right = dfs(root.right);
        
        int currVal = root.val + left.sum + right.sum;
        int currSize = 1 + left.size + right.size;
        
        if(currVal/currSize == root.val) count++;
        
        return new NodeInfo(currVal,currSize);
    }
}