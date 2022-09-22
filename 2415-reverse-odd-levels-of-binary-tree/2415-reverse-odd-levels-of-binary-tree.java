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
    public TreeNode reverseOddLevels(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i =0;i<size;i++)
            {
                TreeNode curr = q.poll();
                temp.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            result.add(temp);
        }
        
        for(int i =0;i<result.size();i++)
        {
           if(i%2!=0) Collections.reverse(result.get(i));
        }
        
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode temp=q.remove();
                temp.val=result.get(level).get(i);
        
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                
            }
            level++;
        }
        
        return root;
    }
}