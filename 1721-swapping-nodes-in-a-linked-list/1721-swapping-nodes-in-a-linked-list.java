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
        ListNode front = null, end = null, curr = head;
        
        while(curr!=null)
        {
            size++;
            if(end!=null) end = end.next;
            
            if(size == k)
            {
                front = curr;
                end = head;
            }
            
            curr = curr.next;
        }
        
        int temp = front.val;
        front.val = end.val;
        end.val = temp;
        
        return head;
    }
}