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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        
        ListNode beforeTemp = before;
        ListNode afterTemp = after;
        
        while(head!=null)
        {
            if(head.val<x)
            {
                beforeTemp.next=head;
                beforeTemp = beforeTemp.next;
            }
            else{
                afterTemp.next = head;
                afterTemp = afterTemp.next;
            }
            head = head.next;
        }
        
        afterTemp.next = null;
        beforeTemp.next = after.next;
        
        return before.next;
     }
}