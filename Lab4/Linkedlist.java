// Java program for reversing the linked list 

class LinkedList { 

	 Node node; 

 class Node { 

		int data; 
		Node next; 

		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 
	
	/* Function to reverse the linked list */

	public Node reverseList(Node head) {
        if(head == null || head.next == null){ //Base case
            return head;
        }
        Node reverseListHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverseListHead;
    }



	// prints content of double linked list 
public void printList(Node head) 
	{ 
		while (head != null) { 
			System.out.print(head.data + " "); 
			head = head.next; 
		} 
	} 

	public static void main(String[] args) 
	{ 
		LinkedList list = new LinkedList(); 
		list.head = new Node(85); 
		list.head.next = new Node(15); 
		list.head.next.next = new Node(4); 
		list.head.next.next.next = new Node(20); 

		System.out.println("Given Linked list"); 
		list.printList(head); 
		Node head = list.reverseList(head); 
		System.out.println(""); 
		System.out.println("Reversed linked list "); 
		list.printList(head); 
	} 
} 

