package nyu.tlj.leetcode.solution;

import nyu.tlj.leetcode.common.ListNode;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode sortList(ListNode head) {
		ListNode mid = new ListNode(0);
		ListNode left = new ListNode(0);
		ListNode right = new ListNode(0);

		if(head.next == null){//head == null add in to if condition
			return head;
		}
		
		mid = findMid(head);

		left = sortList(mid.next);
		mid.next = null;

		right = sortList(head);
		
		left = merge(left,right);
		return left;

	}

	private ListNode findMid(ListNode head) {
		if(head == null || head.next == null || head.next.next == null){
			return head;
		}
		ListNode slow = head, fast = head.next;
		
		while(  fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			
		}
		
		return slow;

	}

	private ListNode merge(ListNode left,ListNode right) {
		ListNode dummy = new ListNode(0);
		ListNode dummyHead = new ListNode(0);
		dummy.next = left;
		dummyHead = dummy;
		
		
		if(left == null){
			return right;
		}
		if(right == null){
			return left;
		}
		
		
		while(left != null && right != null ){
			if(left.val < right.val ){
				dummy.next = left;
				dummy = left;
				left = left.next;
			}else{
				dummy.next = right;
				dummy = dummy.next;
				right = right.next;
			}
		}
		
		dummy.next = (left == null ? right : left );
		
		
		

		return dummyHead.next;

	}
}
