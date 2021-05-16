import java.util.*;

public class MiddleOfLinkedList {

	 public static ListNode middleNode(ListNode head) {
			ListNode c = head;
			int count = 0;
			while(c!=null)
			{
				count++;
				c=c.next;
			}
			int middle=count/2;
					
			ListNode r = head;
			
			int i =0;
			while(i<middle)
			{
				i++;
				r=r.next;
			}
			return r;
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
		ListNode head = takeInput();
		ListNode ans = middleNode(head);
		
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans=ans.next;
		}

	}

}
