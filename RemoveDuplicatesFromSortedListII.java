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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null)
        {
            return null;
        }
        
        ListNode p2 = head,p1 = null;
        head=null;
        int counter;
        
        while(p2!=null)
        {
            counter = 0;
            int val = p2.val;
            ListNode temp = p2;
            
            while(p2!=null && p2.val==val)
            {
                counter++;
                p2=p2.next;
            }
            
            if(counter == 1 &&head == null)
            {
                head = temp;
                p1 = head;
            }
            else{
                if(p1!=null)
                {
                if(counter>1)
                    p1.next=p2;
                else
                    p1=p1.next;
                }
            }
        }
        return head;
        
    }
}
