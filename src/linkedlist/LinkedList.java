package linkedlist;

public class LinkedList {
	
	Node head;
	
	public void addAtFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAtPosition(Node preNode, int data) {
		if (preNode == null) {
			return; 
		}
		
		Node newNode = new Node(data);
		newNode.next = preNode.next;
		preNode.next = newNode;
	}
	
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = new Node(data);
			return;
		}
		
		//No need; 'next' of new node already null 
		//newNode.next = null;
		
		Node last = head;
		while(last.next != null)
			last = last.next;
		
		last.next = newNode;		
	}
	
	public void printList(Node head) {

		Node tmpNode = head;
		while (tmpNode != null) {
			System.out.println(tmpNode.data);
			tmpNode = tmpNode.next;
		}
	}
}
