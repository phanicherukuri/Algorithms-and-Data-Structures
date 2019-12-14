package walmart;

import java.util.*;

public class LinkedListCycle {

	// LC - 141

	public static void main(String[] args) {
		Node fourth = new Node(-4);
		Node third = new Node(0);
		Node second = new Node(2);
		Node head = new Node(3);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = second;

		System.out.println(hasCycle(head));
	}

	private static boolean hasCycle(Node head) {

		if (head == null)
			return false;
// Two pointers implementation
		Node fast = head;
		Node slow = head.next;

		while (fast != slow) {

			if (slow == null || slow.next == null) 
				return false;
			else {
				slow = slow.next.next;
				fast = fast.next;
			}

		}	
		return true;

// HashSet implementation
		
//		Set<Node> set = new HashSet<Node>();
//		while (head != null) {
//			if (set.contains(head)) {
//				return true;
//			} else {
//				set.add(head);
//				head = head.next;
//			}
//		}
//		return false;
	}

}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}

}