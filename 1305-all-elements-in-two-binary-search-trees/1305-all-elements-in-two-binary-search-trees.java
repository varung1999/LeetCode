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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return new ArrayList<>();
        
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        
        
        while(!stack1.isEmpty() || !stack2.isEmpty() || root1!=null || root2!=null)
        {
            while(root1!=null)
            {
                stack1.push(root1);
                root1=root1.left;
            }
            
            while(root2!=null)
            {
                stack2.push(root2);
                root2 = root2.left;
            }
            
            if (stack2.isEmpty() || (!stack1.isEmpty() && stack1.peek().val < stack2.peek().val&& !stack2.isEmpty()))
            {
                TreeNode curr = stack1.pop();
                result.add(curr.val);
                root1=curr.right;
            }
            else{
                TreeNode curr = stack2.pop();
                result.add(curr.val);
                root2=curr.right;
            }
        }
        
        return result;
    }
}