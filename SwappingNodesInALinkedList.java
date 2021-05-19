import java.util.Scanner;

public class SwappingNodesInLL {


/*Best solution: Run time 2ms

 public static ListNode swapNodes(ListNode head, int k) {
		
		ListNode current=head,prev=head,k1=null;
		
		int i =1;
		while(i<k && current.next!=null)
		{
			i++;
			current=current.next;
		}
		
		k1=current;
		
		while(current.next!=null)
		{
			current=current.next;
			prev=prev.next;
		}
		
		int temp = k1.val;
		k1.val=prev.val;
		prev.val=temp;
		
		return head;
		
		
	}


*/
	public static ListNode swapNodes(ListNode head, int k) {
		
		if(k==0)
		{
			return head;
		}
		int total = 0;
		ListNode count = head;
		while(count!=null)
		{
			total++;
			count=count.next;
		}
		
		int endIndex = total - k;
		ListNode endnode = head;
		int i =0;
		while(i<endIndex)
		{
			i++;
			endnode = endnode.next;
		}
		int startIndex = 0;
		ListNode startnode = head;
		while(startIndex<k-1)
		{
			startIndex++;
			startnode = startnode.next;
		}
		
		int temp = startnode.val;
		startnode.val=endnode.val;
		endnode.val=temp;
		
		return head;
	}


	public static ListNode takeInput() {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		ListNode head = null;
		while(data!=-1)
		{
			ListNode current = new ListNode(data);
			if(head==null)
			{
				head=current;
			}
			else
			{
				ListNode tail = head;
				while(tail.next!=null)
				{
					tail=tail.next;
				}
				tail.next=current;
			}
			data=sc.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode head = takeInput();
		ListNode ans = swapNodes(head, 5);//7,9,6,6,7,8,3,0,9,5
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans=ans.next;
		}


	}

}
