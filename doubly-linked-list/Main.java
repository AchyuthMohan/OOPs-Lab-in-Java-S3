class node{

    int item; // to store data item

    node next = null;  // pointer to next node

    node prev = null;  // pointer to previous node

}

class DLinkedList{

    node head = null; // to store head of doubly linked list

}

public class Main

{

	public static void main(String[] args) {

		node a = new node();

		node b = new node();

		a.item = 10;

		b.item = 20;

		DLinkedList dlist = new DLinkedList(); // create doubly linked list object

		dlist.head = a;

		a.next = b; ////link updations when b is nsrted after a

		b.prev = a; //link updations when b is nsrted after a

		node current = dlist.head;

		while(current != null){  // to traverse the list

		System.out.println(current.item);

		current = current.next;

	}

}

}