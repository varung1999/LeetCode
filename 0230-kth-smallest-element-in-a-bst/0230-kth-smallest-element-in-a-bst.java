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
    ArrayList<Integer> list;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        list = new ArrayList<>();
        dfs(root);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0;i<list.size();i++)
        {
            pq.add(list.get(i));
            
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        
        return pq.peek();
    }
    
    private void dfs(TreeNode root){
        if(root == null) return;
        
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}