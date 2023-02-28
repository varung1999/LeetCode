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
    List<TreeNode> res;
    HashMap<String,Integer> count;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        res = new ArrayList<>();
        count = new HashMap<>();
        
        helper(root);
        return res;
    }
    
    private String helper(TreeNode root){
        //base
        if(root == null) return "";
        
        //logic
        String rep = "(" + helper(root.left) +")" + root.val +"(" + helper(root.right) +")";
        count.put(rep,count.getOrDefault(rep,0)+1);
        
        if(count.get(rep)==2){
            res.add(root);
        }
        
        return rep;
    }
}