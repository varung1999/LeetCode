/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	public TreeNode addOneRow(TreeNode root, int val, int depth) {
		if (depth == 1) {
			return new TreeNode(val,root,null);
		}
            
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int currDepth = 2;
    while(currDepth++ < depth) {
        int width = q.size();
        while(width-- > 0) {
            TreeNode curr = q.poll();
            if(curr.left != null)
                q.add(curr.left);
            if(curr.right != null)
                q.add(curr.right);
        }
    }
    // here the queue will have all the nodes from depth-1, then we just update there right/left
    for(TreeNode node : q) {
        node.left = new TreeNode(val,node.left,null);
        node.right = new TreeNode(val,null,node.right);
    }
    
    return root;
    }
}

