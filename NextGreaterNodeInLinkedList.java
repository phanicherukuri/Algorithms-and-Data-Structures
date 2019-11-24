package leetcode;

import java.util.*;

public class NextGreaterNodeInLinkedList {

	public static void main(String[] args) {
		// [2,1,5]
		// [9,7,6,7,6,9] - [0,9,7,9,9,0]
//		Node eight = new Node(1, null);
//		Node seven = new Node(5, eight);
		Node sixth = new Node(9, null);
		Node fifth = new Node(6, sixth);
		Node fourth = new Node(7, fifth);
		Node third = new Node(6, fourth);
		Node second = new Node(7, third);
		Node head = new Node(9, second);

		int[] result = nextLargerNodes(head);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] nextLargerNodes(Node head) {
		Node first = head;
		List<Integer> list = new ArrayList<>();

		while (first.next != null) {
			list.add(first.val);
			first = first.next;
		}
		list.add(first.val);

		int[] result = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) > list.get(i)) {
					result[i] = list.get(j);
					break;
				} else {
					continue;
				}
			}
		}

		return result;
		
		
		/*
		 * Node first = head; Stack<Integer> s1 = new Stack<>(); Stack<Integer> s2 = new
		 * Stack<>(); int listSize = 1; while (first.next != null) { listSize++;
		 * s1.add(first.val); first = first.next; } s1.add(first.val);
		 * 
		 * int[] result = new int[listSize]; //int current = s1.peek(); [9,7,6,7,6,9]
		 * [0,9,7,9,9,0] int pushedElement = -1; int max = s1.peek(); int allMax = -1;
		 * 
		 * while (!s1.empty()) { int thisElement = s1.pop();
		 * 
		 * if(thisElement < pushedElement && thisElement < max) {
		 * s2.push(pushedElement); max = pushedElement; pushedElement = thisElement; }
		 * else if (thisElement >= max ) { s2.push(0); max = thisElement; allMax =
		 * thisElement; pushedElement = 0; } else { s2.push(max); pushedElement =
		 * thisElement; } //previous = current;
		 * 
		 * } int i = 0; while (!s2.empty()) { result[i] = s2.pop(); i++; } return
		 * result;
		 */

	}
}

class Node {
	int val;
	Node next;

	Node(int data, Node next) {
		this.val = data;
		this.next = next;
	}

}
