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
        
        int count = 0;
        ListNode c = head;
        while(c!=null)
        {
            count++;
            c=c.next;
        }
        
        ListNode prev=null,curr=head,next=null;
        int i =0;
        int pos = count - n;
        if(n>count)
        {
            return null;
        }
        if(count == n)
        {
            return head.next;
        }
        while(i<pos-1 && curr!=null)
        {
            i++;
            curr=curr.next;
        }
        
        if(curr!=null)
        {
            prev=curr;
        }
        if(curr.next!=null)
        {
            curr=curr.next;
        }
        next=curr.next;
        
        prev.next=next;
        
        return head;
    }
}
