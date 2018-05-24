package linkedlist;

public class LetsTry {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.addAtEnd(0);
		list.addAtEnd(1);
		list.addAtEnd(2);
		list.addAtEnd(3);
		list.addAtEnd(4);
		list.addAtEnd(5);
		
		list.printList(list.head);
	}

}
