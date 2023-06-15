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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null) return 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        PriorityQueue<Long> pq = new PriorityQueue<>(k);
        //boolean hasCrossed = false;
        q.add(root);
        int level = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            long sum = 0;
            for(int i = 0;i<size;i++)
            {
                TreeNode curr = q.poll();
                sum+=curr.val;
                
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                
            }
            level++;
            
            pq.add(sum);
            if(pq.size()>k){
                
                // hasCrossed = true;
                pq.poll();
            }
        }
        
        System.out.println(level);
        if(level<k) return -1;
        return pq.poll();
    }
}