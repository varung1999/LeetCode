public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
        
  
        StackNode(int data) 
        { 
            this.data=data;
        } 
    } 
    
	//Time Complexity: O(1)
    //Space Complexity: O(1)
    public boolean isEmpty() 
    { 
        
        return root == null;
    } 
  
    //Time Complexity: O(1)
    //Space Complexity: O(1)
    public void push(int data) 
    { 
        
        StackNode nextNode = new StackNode(data);
        nextNode.next=root;
        root = nextNode;


    } 
  
    //Time Complexity: O(1)
    //Space Complexity: O(1)
    public int pop() 
    { 	
        if(root == null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        int pop_element = root.data;
        root=root.next;
        return pop_element;
    } 
  
    //Time Complexity: O(1)
    //Space Complexity: O(1)
    public int peek() 
    { 
        if(root==null)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
