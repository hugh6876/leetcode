package nyu.tlj.leetcode.solution;

import nyu.tlj.leetcode.common.ListNode;

public class InsertionSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(1);
		n1.next = n2;
		n2.next = null;
		
		ListNode head = n1;
		
		new InsertionSortList().insertionSortList(head);

	}
	
	public ListNode insertionSortList(ListNode head) {
		
		
		if(head == null || head.next == null) {
			return head;
		}
		
		//ListNode tmpHead = head;
		ListNode cur = head.next;
		while(cur != null){
			ListNode tmpHead = head;
			//begin
			while(tmpHead!=null  && tmpHead!= cur  ){
				if(tmpHead.val > cur.val  )  {
					break;
				}
				tmpHead = tmpHead.next;
			}
			//end find the node to be swap(the first node greater than current
			
			if(tmpHead != cur){
				while(tmpHead != cur) {
					int val = tmpHead.val;
					tmpHead.val = cur.val;
					cur.val = val; 
					tmpHead = tmpHead.next;
				}//end while. this while remove the nodes greater than current to the latter position
			}
			
			cur = cur.next;
		}
		
		return head;
		
	}
}
