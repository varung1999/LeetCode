import java.util.Scanner;

public class BinaryNumberToInteger {

	public static int getDecimalValue(ListNode head) {
		int sum =0;
		int count =0;
		ListNode c = head;
		while(c!=null)
		{
			count++;
			c=c.next;
		}
		System.out.println(count);
		ListNode ln = head;
		int i = count;
		while(ln!=null)
		{
			sum+= ln.val*(Math.pow(2, count-1));
			count--;
			ln=ln.next;
		}
		
		return sum;//1 0 0 1 0 0 1 1 1 0 0 0 0 0 0
		
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
		int ans = getDecimalValue(head);
		System.out.println(ans);
		while(head!=null)
		{
			System.out.print(head.val+" ");
			head=head.next;
		}
	}

}
