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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        
        ListNode slow = head, fast = head;
        
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        fast = reverse(slow);
        slow.next = null;
        slow = head;
        
        while(fast!=null)
        {
            if(fast.val!=slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        
        return true;
    }
    
    private ListNode reverse(ListNode head)
    {
        if(head == null || head.next == null) return head;
        
        ListNode curr = reverse(head.next);
        head.next.next = head;
        head.next = null;
        
        return curr;
        
    }
}