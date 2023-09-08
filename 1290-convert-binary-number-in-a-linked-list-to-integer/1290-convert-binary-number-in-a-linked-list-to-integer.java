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
    public int getDecimalValue(ListNode head) {
        if(head == null) return 0;
        
        long number = 0;
        
        ListNode temp = reverse(head);
        
        int i = 0;
        while(temp!=null)
        {
            number = number + (temp.val*(long)Math.pow(2,i++));
            temp = temp.next;
        }
        
        return (int)number;
    }
    
    private ListNode reverse(ListNode head)
    {
        //base
        if(head.next == null) return head;
        
        //logic
        ListNode temp = reverse(head.next);
        head.next.next = head;
        head.next = null;
        
        return temp;
    }
}