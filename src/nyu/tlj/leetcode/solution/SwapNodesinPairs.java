package nyu.tlj.leetcode.solution;

import nyu.tlj.leetcode.common.ListNode;

public class SwapNodesinPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode swapPairs(ListNode head) {
		ListNode dummyHead = head;
		if(head == null || head.next == null){
			return head;
		}
		int tmp = 0;
		while(head != null && head.next!=null){
			tmp = head.next.val;
			head.next.val = head.val;
			head.val = tmp;
			head = head.next.next;
		}
		
		return dummyHead;
	}

}
