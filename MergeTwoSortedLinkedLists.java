import java.util.*;

public class MergeTwoLists {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null && l2!=null)
        {
            return l2;
        }
        if(l1!=null && l2==null)
        {
            return l1;
        }
        if(l1==null && l2 == null)
        {
            return null;
        }
		ListNode t1=l1,t2=l2;
		ListNode head=null,tail=null;
		
		if(t1.val<=t2.val)
		{
			head=t1;
			tail=t1;
			t1=t1.next;
		}
		else
		{
			head=t2;
			tail=t2;
			t2=t2.next;
		}
		
		while(t1!=null && t2!=null)
		{
			if(t1.val<=t2.val) {
				tail.next=t1;
				tail=t1;
				t1=t1.next;
			}
			else
			{
				tail.next=t2;
				tail=t2;
				t2=t2.next;
			}
		}
		
		if(t1!=null)
		{
			tail.next=t1;
			tail=t1;
			t1=t1.next;
		}
		if(t2!=null)
		{
			tail.next=t2;
			tail=t2;
			t2=t2.next;
		}
		return head;


	}
	public static ListNode takeInput() {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		ListNode head = null,tail=null;
		while(data!=-1)
		{
			ListNode current = new ListNode();
			current.val=data;

			if(head==null)
			{
				head=current;
				tail=current;
			}
			else
			{
				tail.next=current;
				tail=current;
			}
			data=sc.nextInt();
		}
		return head;
	}


	public static void main(String[] args) {
		ListNode head1 = takeInput();
		ListNode head2 = takeInput();

		ListNode ans = mergeTwoLists(head1, head2);
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans=ans.next;
		}

	}

}
