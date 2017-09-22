package DataStructures;

import DataStructures.LinkedList.Node;

public class CallingLinkedList {
	
	public static void main(String ...ccc)
	{
		
		/*
		 * 
		 * Linked List creation
		 */
		
		
		//LIST 1
		
		LinkedList list1= new LinkedList();
		
		Node node1 = list1.new Node(10);		//as nested class, object is list.node while reference is of NODE
		list1.head=node1;						//if we create Node class as static then we dont need this list1 infront of node object
	
		Node node2=list1.new Node(20);
		Node node3=list1.new Node(40);
		Node node4=list1.new Node(30);
	
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		
		//LIST 2
		
		LinkedList list2 = new LinkedList();
		list2.head=list2.new Node(100);		
		Node node22= list2.new Node(200);
		Node node33= list2.new Node(400);
		Node node44= list2.new Node(300);
		
		list2.head.next=node22;
		node22.next=node33;
		node33.next=node44;
		
		
		
		/*
		 * Linked list traversal
		 * 
		 */
		
		
		list1.displayList();
		list2.displayList();
		
		System.out.println("##############################");
		
		list1.push(list1.new Node(500));
		list1.displayList();
	
		System.out.println("##############################");
		
		list1.append(list1.new Node(4000));
		list1.displayList();
		
		System.out.println("##############################");
		list1.insert(list1.head.next.next.next, list1.new Node(20));
		list1.displayList();
		
		System.out.println("##############################");
		list1.deleteNode(20);
		list1.displayList();
		
		System.out.println("##############################");
		list1.deleteNodeAtIndex(4);
		list1.displayList();
		
		System.out.println("##############################");
		System.out.println(list1.getCount());
		System.out.println(list1.getCountrecursion());
		
		
		
		
		
		LinkedList list3 = new LinkedList();
		list3.head=list3.new Node(10);
		Node node_a=list3.new Node(12);
		Node node_b=list3.new Node(14);
		Node node_c=list3.new Node(16);
		Node node_d=list3.new Node(18);
		Node node_e=list3.new Node(20);
		Node node_f=list3.new Node(22);
		list3.head.next=node_a;
		node_a.next=node_b;
		node_b.next=node_c;
		node_c.next=node_d;
		node_d.next=node_e;
		node_e.next=node_f;
		System.out.println("##############################");
		list3.displayList();
		
		list3.swapNodes(node_a,node_d);
		System.out.println("##############################");
		list3.displayList();
		//Swapping 2 nodes based on data 
		
		
		
		
		
	
	}

	
}