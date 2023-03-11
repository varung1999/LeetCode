/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    ArrayList<Integer> values;
    public TreeNode sortedListToBST(ListNode head) {
        values = new ArrayList<>();
        
        convert(head);
        
       return formTree(0,values.size()-1);
    }
    
    private void convert(ListNode head)
    {
        if(head == null) return;
        
        while(head!=null)
        {
            values.add(head.val);
            head = head.next;
        }
    }
    
    private TreeNode formTree(int left, int right)
    {
        if(left>right) return null;
        
        int mid = (left+right)/2;
        TreeNode node = new TreeNode(values.get(mid));
        
        if(left == right) return node;
        
        node.left = formTree(left, mid - 1);
        node.right = formTree(mid+1,right);
        
        return node;
    }
}