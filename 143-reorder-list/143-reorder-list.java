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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        
        ListNode slow = head, fast = head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //reversing the list
        fast = reverse(slow.next);
        //splitting the list
        slow.next = null;
        
        //merging the list
        slow = head;
        ListNode temp = null;
        
        while(fast!=null)
        {
            temp = slow.next;
            slow.next = fast;
            fast = fast.next;
            slow.next.next = temp;
            slow = temp;
        }
        
        
    }
    
    private ListNode reverse(ListNode head)
    {
        if(head == null || head.next == null) return head;
        ListNode curr =head;
        ListNode prev = null;
        ListNode fast = head.next;
        
        while(fast!=null)
        {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        
        curr.next = prev;
        return curr;
    }
}