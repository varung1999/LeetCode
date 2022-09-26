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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null) return null;
        
        TreeNode ans = dfs(nums,0,nums.length-1);
        return ans;
    }
    
    private TreeNode dfs(int[] nums,int start, int end)
    {
        //base
        if(start>end) return null;
        
        //logic
        int mid = start + (end - start)/2;
        TreeNode temp = new TreeNode(nums[mid]);
        temp.left = dfs(nums,start,mid-1);
        temp.right = dfs(nums,mid+1,end);
        
        return temp;
    }
}