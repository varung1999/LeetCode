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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) { 
        result = new ArrayList<>();
        if(root == null) return result;
        
        helper(root,0,targetSum,new ArrayList<>());
        
        return result;
    }
    
    private void helper(TreeNode root, int currSum, int target, List<Integer> temp)
    {
        //base
        if(root == null) return;
        
        //logic
        
        currSum+=root.val;
        temp.add(root.val);
        if(root.left == null && root.right == null)
        {
            if(currSum  == target){
                result.add(temp);
                return;
            }
        }
        
        helper(root.left,currSum,target,new ArrayList<>(temp));
        helper(root.right,currSum,target,new ArrayList<>(temp));
    }
}