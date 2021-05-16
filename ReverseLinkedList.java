import java.util.Scanner;

public class ReverseList {

	public static ListNode reverseList(ListNode head) {
		
		if(head==null || head.next==null)
		{
			return head;
		}
		
		ListNode shead = reverseList(head.next);
		ListNode rtail = head.next;
		rtail.next=head;
		head.next=null;
		return shead;
		
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
		ListNode ans = reverseList(head);
		
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans=ans.next;
		}

	}

}
