package crackingthecodinginterview;

public class LinkedList {

	// 4 -> 5 -> 6 -> 23 -> 3

	public static void main(String[] args) {
		Node last = new Node(3, null);
		Node fourth = new Node(23, last);
		Node third = new Node(6, fourth);
		Node second = new Node(5, third);
		Node head = new Node(4, second);

		int dataToBeInserted = 44;
		int position = -1;
		int nodeData = 3;

		// insert node based on the position
		// insert node at the start
		// insert node at the end
		// delete node at the position
		// delete node at the end
		// delete node at the start
		// print the list

		head = insertAtPosition(head, dataToBeInserted, position);
		printList(head);
		head = deleteNode(head, nodeData);
		printList(head);

	}

	private static Node insertAtPosition(Node head, int dataToBeInserted, int position) {
		int i = 1;
		Node start = head;
		Node previous = head;

		while (start.next != null || i == position) {
			if (position == 1) {
				Node newNode = new Node(dataToBeInserted, start);
				return newNode;
			} else if (position == i) {

				Node newNode = new Node(dataToBeInserted, start);
				previous.next = newNode;
				// start.next = newNode;
				break;
			}
			i++;
			previous = start;
			start = start.next;
		}

		if (++i == position || position == -1) {
			Node newNode = new Node(dataToBeInserted, null);
			start.next = newNode;
		}
		return head;
	}

	private static Node deleteNode(Node head, int nodeData) {
		int i = 1;
		Node start = head;
		Node previous = head;

		while (start.next != null) {
			if (start.data == nodeData && i == 1) {
				start = start.next;
				return start;
			}
			if (start.data == nodeData) {
				previous.next = start.next;
				return head;
			}
			previous = start;
			start = start.next;
			i++;
		}
		if (start.data == nodeData) {
			previous.next = null;
		}

		return head;
	}

	private static void printList(Node start) {
		while (start.next != null) {
			System.out.println(start.data);
			start = start.next;
		}
		System.out.println(start.data);
	}

}

class Node {
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

}
