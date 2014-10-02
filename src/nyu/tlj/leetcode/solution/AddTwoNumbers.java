package nyu.tlj.leetcode.solution;

import nyu.tlj.leetcode.common.ListNode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode l1 = new ListNode(7);
		ListNode l2 = new ListNode(3);
		l1.next = l2;
		ListNode l3 = new ListNode(0);
		AddTwoNumbers ada = new AddTwoNumbers();
		ada.addTwoNumbers(l3, l1);
		
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null) {
			return null;
		}
		
		ListNode cur1 = l1, cur2 = l2 , head, cur = new ListNode(0);
		int carryOn = 0;
		head = cur;
		int sum = 0;
		while( cur1 != null || cur2 != null ){
			sum = (cur1 == null ? 0 : cur1.val) + ( cur2 ==  null ? 0 : cur2.val ) + carryOn;
			carryOn = 0;
			if( sum >= 10 ){
				sum -= 10;
				carryOn = 1;
			}
			if( cur1 != null ) {
				cur.next = cur1;
				cur1 = cur1.next;
				
			}
			if( cur2 != null){
				cur.next = cur2;
				cur2 = cur2.next;
				
			}
			cur.next.val = sum;
			cur = cur.next;
			
		}
		if( carryOn == 1) {
			cur.next = new ListNode(1);
		}
		
		return head.next;

	}
/**
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null) {
			return null;
		}

		return addTwoNumbers(l1, l2, 0);

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carryOn) {
		if( l1 == null && l2 == null ){
			return null;
		}
		l1.val = (  l1==null  ? 0 : l1.val )  + ( l2 == null ? 0 : l2.val ) + carryOn;
		if (l1.val >= 10) {
			carryOn = 1;
			l1.val -= 10;
		} else {
			carryOn = 0;
		}
		//last node
		if( (l1.next == null && l2.next == null) || (l1 == null && l2.next == null)  || (l1.next == null && l2 == null ) ){
			if (carryOn == 1) {
				ListNode tail = new ListNode(1);
				tail.next = null;
				l1.next = tail;
				return l1;
			} else {
				return l1;
			}
			
			
		}
		
		

		addTwoNumbers(l1.next==null?null:l1.next, l2.next==null?null:l2.next, carryOn);

		return l1;
	}
	*/

}
