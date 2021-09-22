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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        int carry  = 0,sum=0;
        ListNode r_l1 =l1;
        ListNode r_l2 = l2;
        
        ListNode ansHead = null,ansTail = null;
        while(r_l1!=null || r_l2!=null)
        {
            
            if(r_l1 == null)
            {
                sum = carry + r_l2.val;
            }
            else if(r_l2 == null)
            {
                sum = carry + r_l1.val;
            }
            else
            {
                sum = carry + r_l1.val + r_l2.val;
            }
            carry = 0;
            
            if(sum>9)
            {
                carry = 1;
                sum = sum%10;
            }
            
            ListNode cn = new ListNode(sum);
            
            if(ansHead==null)
            {
                ansHead= cn;
                ansTail = cn;
            }
            else
            {
                ansTail.next = cn;
                ansTail=ansTail.next;
            }
            
            if(r_l1!=null)
            {
                r_l1=r_l1.next;
            }
            if(r_l2!=null)
            {
                r_l2=r_l2.next;
            }
            
        }
        
        if(carry>0)
        {
            ListNode temp = new ListNode(carry);
            ansTail.next=temp;
        }
        
        return ansHead;
    }
    
  
}
