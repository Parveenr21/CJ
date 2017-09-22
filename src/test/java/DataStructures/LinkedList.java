package DataStructures;

public class LinkedList {

	Node head;

	class Node {

		int data;		
		Node next;			//This variable will hold the next NODE object

		// Constructor 1
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;

		}

		// Constructor 2
		public Node(int data) {
			this.data = data;
			this.next = null;

		}

	}

	// Print method or traversal
	// Here traversal is in Node class means just get the DATA for each node, . 
	//we already have head node.. just iterate to its next till it gets null
	// traverse through link list.

	public void displayList() {
		Node n = head;
		int i = 1;
		while (n != null) {

			System.out.println("node " + i + "  is with data " + n.data);
			++i;
			n = n.next;
		}
	}

	// Push a node at front of list

	public void push(Node newnode) {

		if (head == null) {						//for empty list

			head = newnode;
		}

		newnode.next = head;		
		head = newnode;		//setting new head.

		// o(1) complexity here its a constant
	}

	// Append a node at last of list

	public void append(Node newnode) {
		Node node = null;
		
		if (head == null) {			//for empty list

			head = newnode;
		}

		// traverse through end
		node = head;
		while (node.next != null) {
			node = node.next;

		}

		node.next = newnode;

		// o(n) complexity here its depending on number of nodes in linked list
	}

	// Add a node after specified node

	public void insert(Node prev, Node newnode) {

		newnode.next = prev.next;
		prev.next = newnode;

		// o(1) complexity here its a constant

	}

	public void deleteNode(int value) // delete node at first value occurence.
	{
		// logic here is to keep track of previous node and current node to be
		// deleted.
		// just set previousnode.next=currentnode.next , while the node will be
		// delete by automatic garbage collector.

		Node node = head;
		Node prevnode = null;

		if (head.data == value) // if head value has the key
		{
			head = head.next;
			return; // return control back to caller
		}

		while (node.data != value) // traversing link list to find matching
		{
			prevnode = node;
			node = node.next; // set the next node with current

		}
		// How to handle null pointer exception here.
		prevnode.next = node.next;

	}

	// delete node at an index

	public void deleteNodeAtIndex(int position) {

		Node node = head;
		Node prevnode = null;
		int i = 0;
		if (position == 0) {

			head = head.next;

		}

		while (i < position) // traversing node till the position
		{
			prevnode = node;
			node = node.next;
			++i;
		}

		prevnode.next = node.next;

	}

	// finding length of linked list using iteration

	public int getCount() {

		Node node = head;
		int count = 1;
		while (node.next != null) {
			node = node.next; // increment node to next
			count++; // incrementing counter
		}

		return count;
	}

	// finding length of linked list using recursion

	public int getCountRecursionApproach(Node node) {
		if (node == null) {
			return 0;
		}

		return 1 + getCountRecursionApproach(node.next);

	}

	public int getCountrecursion() {

		return getCountRecursionApproach(head);
	}

	
	
	public void swapNodes(Node x, Node y)
	{
		Node node=head;
		Node prevXnode=null, nextX= null;
		Node prevYnode=null, nextY= null;
		
		
		while(!(node.next.equals(x)))
		{
			prevXnode=node;
			node=node.next;
			nextX=node;
			
		}
		
		
		
		node=head;
		
		while(!node.next.equals(y))
		{
			prevYnode=node;
			node=node.next;
			nextY=node;
			
		}
		
		
	if(x==head){	
			x.next=nextY;
			prevYnode.next=x;
			y.next=nextX;
	}
	
	if(y==head){	
		y.next=nextX;
		prevXnode.next=y;
		x.next=nextY;
}
	
	if(x.next==null)
	{
		x.next=nextY;
		prevYnode.next=x;
		prevXnode.next=y;
		
	}
		
	
	if(y.next==null)
	{
		y.next=nextX;
		prevXnode.next=y;
		prevYnode.next=x;
		
	}
	
	
	else{
		
		x.next=nextY;
		prevXnode.next=y;
		prevYnode.next=x;
		x=prevYnode;
		y.next=nextX;

		
	}
		
	}
	
}
