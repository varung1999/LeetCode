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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        
        helper(root,map,res);
        return res;
    }
    
    private String helper(TreeNode root, HashMap<String,Integer> map, List<TreeNode> res)
    {
        //base
        if(root == null) return "#";
        
        //logic
        String sb = new StringBuilder()
            .append("l")
            .append(helper(root.left,map,res))
            .append(root.val)
            .append("r")
            .append(helper(root.right,map,res))
            .toString();
        
        int val = map.getOrDefault(sb,0);
        
        if(val == 1)
        {
            res.add(root);
        }
        
        map.put(sb,val+1);
        return sb.toString();
    }
}