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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        
        while(temp!=null)
        {
            size++;
            temp = temp.next;
        }
        
        if(n==size) return head.next;
        
        int diff = size - n;
        int count = 0;
        temp = head;
        while(temp!=null && count<diff - 1)
        {
            temp = temp.next;
            count++;
        }
        
        temp.next = temp.next.next;
        return head;
    }
}