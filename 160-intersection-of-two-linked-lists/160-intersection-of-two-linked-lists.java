/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        
        int lenA = 0;
        ListNode temp = headA;
        while(temp!=null)
        {
            lenA++;
            temp = temp.next;
        }
        
        int lenB = 0;
        temp = headB;
        while(temp!=null)
        {
            lenB++;
            temp = temp.next;
        }
        
        if(lenB>lenA)
        {
            while(lenB>lenA)
            {
                lenB--;
                headB = headB.next;
            }
        }
        
        else if(lenA>lenB)
        {
            while(lenA>lenB)
            {
                lenA--;
                headA = headA.next;
            }
        }
        
        while(headA!=headB)
        {
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
}