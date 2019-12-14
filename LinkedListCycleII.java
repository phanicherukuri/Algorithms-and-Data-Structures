package leetcode;

import java.util.*;

public class LinkedListCycleII {
	
	//LC - 142

	public static void main(String[] args) {

		ListNode fourth = new ListNode(-4);
		ListNode third = new ListNode(0);
		ListNode second = new ListNode(2);
		ListNode head = new ListNode(3);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = second;

		System.out.println(detectCycle(head).data);

	}

	private static ListNode detectCycle(ListNode head) {
		if (head == null)
			return null;
		Set<ListNode> set = new HashSet<>();
		while (head.next != null) {
			if (set.contains(head)) {
				return head;
			} else {
				set.add(head);
				head = head.next;
			}
		}

		return null;
	}
}

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}

}