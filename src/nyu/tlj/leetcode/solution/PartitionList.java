package nyu.tlj.leetcode.solution;

import nyu.tlj.leetcode.common.ListNode;

public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode partition(ListNode head, int x) {
		if(head == null){
			return head;
		}
		
		ListNode leftDummy = new ListNode(0);
		ListNode rightDummy = new ListNode(0);
		
		ListNode left = leftDummy, right = rightDummy;
		
		while(head != null){
			
			if(head.val < x){
				left.next = head;
				left = left.next;
			}else{
				right.next = head;
				right = right.next;
			}
			
			head = head.next;
		}
		
		right.next = null;
		left.next = rightDummy.next;
		
		return leftDummy.next;

	}

}
