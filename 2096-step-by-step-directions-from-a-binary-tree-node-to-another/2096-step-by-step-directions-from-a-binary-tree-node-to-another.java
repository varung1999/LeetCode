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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        
        StringBuilder s = new StringBuilder(), d = new StringBuilder();
        
        helper(root,startValue,s);
        helper(root,destValue,d);
        
        int i = 0, max = Math.min(s.length(),d.length());
        
        while(i<max && s.charAt(s.length()-i-1) == d.charAt(d.length() - i - 1)){
            ++i;
        }
        
        return "U".repeat(s.length() - i) + d.reverse().toString().substring(i);
        
    }
    
    private boolean helper(TreeNode root, int target, StringBuilder path)
    {
        //base
        if(root.val == target) return true;
        
        //logic
        if(root.left!=null && helper(root.left,target,path)) path.append("L");
        else if(root.right!=null && helper(root.right,target,path)) path.append("R");
        
        return path.length()>0;
    }
}