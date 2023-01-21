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
    public int[] findMode(TreeNode root) {
        if(root == null) return new int[]{};
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode curr = q.poll();
            map.put(curr.val,map.getOrDefault(curr.val,0)+1);
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        
        int max = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<>();
        for(int val : map.values()) max = Math.max(max,val);
        
        for(int key : map.keySet())
        {
            if(map.get(key) == max) res.add(key);
        }
        
        int[] result = new int[res.size()];
        for(int i =0;i<res.size();i++)
        {
            result[i] = res.get(i);
        }
        
        return result;
    }
}