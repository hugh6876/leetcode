package nyu.tlj.leetcode.solution;

import nyu.tlj.leetcode.common.ListNode;

public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		
		node1.next = null;
		node2.next = null;
		
		RotateList rt = new RotateList();
		rt.rotateRight(node1, 99);
		

	}

	public ListNode rotateRight(ListNode head, int n) {
		ListNode cur, headA, tailA = null, headB = null, tailB = null;
		if (head == null)
			return null;
		if (n == 0)
			return head;
		headA = head;
		cur = head;
		int len = 0;
		while (cur != null) {
			len++;
			cur = cur.next;
		}
		while( n > len) {
			n = n - len;
		}
		if (n == len ) {
			return head;
		}
		
		cur = head;

		int k = 0;
		while (cur != null) {
			k++;

			if (k == (len - n)) {
				tailA = cur;
				headB = cur.next;
			}
			if (k == len) {
				tailB = cur;
			}
			cur = cur.next;
		}

		tailA.next = null;

		tailB.next = head;

		head = headB;
		return head;
	}

}
