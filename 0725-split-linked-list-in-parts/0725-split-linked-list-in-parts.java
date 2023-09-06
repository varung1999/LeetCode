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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        
        int count = helperSize(head);
        
        ListNode[] ans = new ListNode[k];
        
        ListNode curr = head;
        int size = count/k, extra = count%k;
        
        for(int i = 0;i<k && curr!=null;i++)
        {
            ans[i] = curr;
            
            for(int j = 0;j<size + (extra>0?1:0)-1;j++) 
            {
                curr = curr.next;
            }
            
            ListNode temp = curr.next;
            curr.next = null;
            curr = temp;
            extra--;
        }
        
        return ans;
    }
    
    private int helperSize(ListNode head)
    {
        //base
        if(head == null) return 0;
        if(head.next == null) return 1;
        
        int count = 0;
        while(head!=null)
        {
            count++;
            head = head.next;
        }
        
        return count;
    }
}