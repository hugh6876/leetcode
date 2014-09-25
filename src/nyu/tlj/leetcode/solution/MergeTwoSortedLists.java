package nyu.tlj.leetcode.solution;

import nyu.tlj.leetcode.common.ListNode;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode dummyCursor = new ListNode(0);
		
		dummyHead = dummyCursor;
		
		while( l1 != null && l2 != null ){
			if(l1.val < l2.val ){
				dummyCursor.next = l1;
				dummyCursor = l1;
				l1 = l1.next;
			}else{
				dummyCursor.next = l2;
				dummyCursor = l2;
				l2 = l2.next;
			}
		}
		
		dummyCursor.next = ( l1 == null ? l2 : l1);
		
		return dummyHead.next;

	}

}
