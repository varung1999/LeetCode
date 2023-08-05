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
    public List<TreeNode> allPossibleFBT(int n) {
        if(n%2==0) return new ArrayList<>();
        return solve(n);
    }
    
    private List<TreeNode> solve(int n)
    {
        //base
        List<TreeNode> result = new ArrayList<>();
        if(n%2==0)
        {
            result.add(null);
            return result;
        }
        
        if(n==1)
        {
            TreeNode root = new TreeNode(0);
            result.add(root);
            return result;
        }
        
        
        //logic
        for(int i = 1;i<n;i+=2)
        {
            List<TreeNode> left = solve(i);
            List<TreeNode> right = solve(n-i-1);
            
            for(TreeNode leftChild :left)
            {
                for(TreeNode rightChild: right)
                {
                    TreeNode root = new TreeNode(0);
                    root.left = leftChild;
                    root.right = rightChild;
                    
                    result.add(root);
                }
            }
        }
        
        return result;
    }
}