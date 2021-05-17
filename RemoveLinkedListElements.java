import java.util.*;

public class RemoveNode {

	public static ListNode removeElements(ListNode head, int val) {
		while(head!=null && head.val==val)
		{
			head=head.next;
		}

		ListNode temp = head;

		if(temp==null)
		{
			return head;
		}
		else
		{
			while(temp.next!=null)
			{
				if(temp.next.val==val)
				{
					temp.next=temp.next.next;
				}
				else
				{
					temp=temp.next;
				}
			}
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
		ListNode head = takeInput();
		ListNode ans = removeElements(head, 6);// 1 2 6 3 4 5 6
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans=ans.next;
		}



	}

}
