package nyu.tlj.leetcode.solution;

import nyu.tlj.leetcode.common.ListNode;

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow = head;
		ListNode fast = head.next;
		if(slow == fast)return true;
		
		while(fast!=null) {
			slow = slow.next;
			fast = fast.next;
			if(fast == null) return false;
			
			fast = fast.next;
			if(slow == fast)return true;
			
		}
		
		return false;
	}

}
