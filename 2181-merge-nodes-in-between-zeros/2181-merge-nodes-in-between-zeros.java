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
    public ListNode mergeNodes(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        
        ListNode start = head, end = head.next;
        int sum = 0;
        while(end!=null){
            sum+= end.val;
            end = end.next;
            if(end!=null && (end.val == 0 && start.val == 0)){
                temp.next = new ListNode(sum);
                temp = temp.next;
                start = end;
                sum = 0;
            }
        }
        
        return dummy.next;
    }
}