package nyu.tlj.leetcode.solution;

import nyu.tlj.leetcode.common.ListNode;

public class LinkedListCycleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ListNode detectCycle(ListNode head) {
		 if(head == null || head.next == null){
			 return null;
		 }
		 
		 ListNode slow = head, fast = head;
		 
		 
		 while(fast != null && fast.next != null){
			 slow = slow.next;
			 fast = fast.next.next;
			 if(slow == fast){
				 if(slow == head){
					 return slow;
				 }
				 slow = head;
				 break;
			 }
		 }
		 
		 if(fast == null || fast.next == null){
			 return null;
		 }
		 
		 do{
			 slow = slow.next;
			 fast = fast.next;
			 if(slow == fast){
				 break;
			 }
			 
		 }while(slow != head);
		 return slow;
	    }
}
