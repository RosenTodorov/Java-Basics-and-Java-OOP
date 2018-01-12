import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListImplementation {
	private static class Node {
		private int data;
		private Node next, head;
		
		public Node(int data, Node head) {
			this.data = data;
			this.head = head;
		}
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void append(int data) {  // or insert
		//if head is null, so we are creating a head element and return it.
		Node head = null;
		if (head == null) {
			head = new Node(data);
			return;
		}
		
		Node temp = head;
		
		// we are looping until the end of the linked list.
		while(temp.next != null) {
			temp = temp.next;
		}
	    // so when we come to the end of the linked list.
        // create this new node with the given data.
		temp.next = new Node(data);
	}
	
	public static Node insert(Node head, int data) { //or append second variant
		if (head == null) {
			head = new Node(data);
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data);
		}
		return head;
	}
	
	/* with prepend method, we are going to create a new head to the existing list,  
	we want to add a new head to the beginning such as following : 9 -> 1 -> 5 -> 3 -> 7 */
	public void prepend(int data, Node head) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	// with delete method, we are going to delete the first node that has a particular value.
	public void deleteWithValue(int data, Node head) {
		if(head == null) {
			return;
		}
		
		// in order to prevent to delete head element of the list
		if (head.data == data) {
			head = head.next;
			return;
		}
		
		Node temp = head; // walk through the linked list
		while(temp.next != null) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;		
		}
	}
	
	public static void traverse(Node head) { // or display
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
    // Runtime Complexity: Linear, O(n); Memory Complexity: Constant, O(1).	
	public static Node reverseIterative(Node head) {
    // no need to reverse if head is null or there is only one 1 node.		
		if (head == null || head.next == null) {
			return head;
		}
		
		Node list_to_do = head.next;
		Node reversed_list = head;
		
	   /* with recursion: 
	   Node reversed_list = reverseIterative(head.next);
	   head.next.next = head;
	   head.next = null; 
	   */
		reversed_list.next = null;
		
		while (list_to_do != null) {
			Node temp = list_to_do;
			list_to_do = list_to_do.next;
			
			temp.next = reversed_list;
			reversed_list = temp;
		}
		
		return reversed_list;
	}
	
    // classical interview question.
    // Given a linked list, how to detect a cycle in the list
	public boolean hasCycle(Node head) {
		if (head == null) {
			return false; // No Cycle;
		}
		
	// Two pointers:
		Node fast = head.next;
		Node slow = head;
		
		while (fast != null && fast.next != null) {
			if (fast == slow) {
				return true;
			}
			fast = fast.next.next; //2 jumps 
			slow = slow.next; //1 jump
		}
		return false;
	}
	
/* The simplest one is to traverse the original list and copy each node by using the addFirst() 7
method. When this is finished, you will have a new list in the reverse order. Finally, we will have to reverse the list: 
	public Object copy()
{
   LinkedList<AnyType> copy = new LinkedList<AnyType>();
   Node<AnyType> temp = head;
   while(temp != null)
   {
      copy.append(temp.data);
      temp = temp.next;
   }

   return copy.reverse();
} */
	
    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	Node head = null;
    	int n = input.nextInt();
    	
    	while (n != 0) {
    		int element = input.nextInt();
    		head = insert(head, element);
    	}
    	traverse(head);
    	input.close();
    }
}

