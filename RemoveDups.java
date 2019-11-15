package crackingthecodinginterview;

import java.util.*;

public class RemoveDups {

	public static void main(String[] args) {
		Node last = new Node(4, null);
		Node fifth = new Node(5, last);
		Node fourth = new Node(23, fifth);
		Node third = new Node(6, fourth);
		Node second = new Node(5, third);
		Node head = new Node(4, second);
		
		head = removeDuplicates(head);
	}
	
	private static Node removeDuplicates(Node head) {
		Set<Integer> set = new HashSet<Integer>();
		Node start = head;
		Node previous = head;
		
		while(start.next != null) {
			if(!set.add(start.data)) {
				previous.next = start.next;
				start = start.next;
				continue;
			}
			previous = start;
			start = start.next;
		}
		
		if(!set.add(start.data)) {
			previous.next=null;
		}
		return head;
	}

}
	
