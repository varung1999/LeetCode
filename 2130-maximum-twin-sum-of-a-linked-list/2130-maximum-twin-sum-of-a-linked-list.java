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
    public int pairSum(ListNode head) {
        if(head == null) return 0;
        
        ListNode slow = head, fast = head;
        
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode reverse = helper(slow);
        
        slow.next = null;
        slow = head;
        int sum = 0;
        while(slow!=null && reverse!=null)
        {
            sum = Math.max(sum, slow.val + reverse.val);
            slow = slow.next;
            reverse = reverse.next;
        }
        
        return sum;
    }
    
    private ListNode helper(ListNode head)
    {
        if(head == null || head.next == null) return head;
        
        ListNode temp = helper(head.next);
        
        head.next.next = head;
        head.next = null;
        
        return temp;
    }
}