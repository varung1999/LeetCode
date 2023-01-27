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
    public ListNode swapNodes(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            size++;
            temp = temp.next;
        }
        
        ListNode front = head;
        for(int i = 1;i<k;i++)
        {
            front = front.next;
        }
        
        ListNode end = head;
        for(int i = 1;i<=size - k;i++)
        {
            end = end.next;
        }
        
        int value = front.val;
        front.val = end.val;
        end.val = value;
        
        return head;
    }
}