package nyu.tlj.leetcode.solution;

import nyu.tlj.leetcode.common.ListNode;

public class RemoveDuplicatesfromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		ListNode pre = head, next = pre.next;

		while (next != null) {
			if (pre.val == next.val) {
				pre.next = next.next;
				next = next.next;
			} else {
				pre = next;
				next = next.next;
			}
		}

		return head;

	}

}
