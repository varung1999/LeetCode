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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int size = helper(head);
        ListNode prev = null, curr = dummy;
        
        for(int i = 0;i<left;i++)
        {
            prev = curr;
            curr = curr.next;
        }
        ListNode rightPrevNode = dummy;
        
        for(int i = 0;i<right;i++)
        {
            rightPrevNode = rightPrevNode.next;
        }
        ListNode rightNode = new ListNode(-1);
        rightNode = rightPrevNode.next;
        rightPrevNode.next = null;
        
        curr = reverse(curr);
        System.out.print(curr.val+" "+rightPrevNode.val);
        prev.next = curr;
        while(curr.next!=null)
        {
            curr = curr.next;
        }
        //System.out.print(curr.val);
        curr.next = rightNode;
        //System.out.print(prev.val+" "+curr.val+" "+rightPrevNode.val+" "+rightNode.val);
        return dummy.next;
    }
    
    private int helper(ListNode head)
    {
        int count = 0;
        while(head!=null)
        {
            count++;
            head = head.next;
        }
        return count;
    }
    
    ListNode reverse(ListNode head) {
        if (head.next == null) return head;
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}