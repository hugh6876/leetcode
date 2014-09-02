package nyu.tlj.leetcode.solution;


import nyu.tlj.leetcode.common.ListNode;

public class ReverseLinkedListII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		
		n1.next = n2; n2.next = n3;n3.next = null;
		ReverseLinkedListII ra = new ReverseLinkedListII();
		ra.reverseBetween(n1, 2, 3);

	}
	
	
	 public ListNode reverseBetween(ListNode head, int m, int n) {
		 if(m==n){
			 return head;
		 }
		 ListNode dummy = new ListNode(0);
		 dummy.next = head;
		 head = dummy;
		 ListNode dummyH = new ListNode(0);
		 ListNode dummyT = new ListNode(0);//the node next to n
	
		 
		 
		 int index = 0;
		 while(head.next != null){
			 index ++;
			 if(index == m){
				 dummyH = head;
			 }
			 if(index == n){
				 //dummyH.next = head.next;
				 dummyT = head.next.next;
				 head.next.next = null;
				 break;
			 }
			 head = head.next;
			 
		 }
		 
		 ListNode reversHead = reverse(dummyH.next);
			 
		 dummyH.next.next = dummyT;
		 
		 dummyH.next = reversHead;
		 if(m==1){
			 return reversHead;
		 }
		 
		 return dummy.next;
	        
	    }
	 
	 private ListNode reverse(ListNode head) {
		 if(head == null || head.next == null){
			 return head;
		 }
		 ListNode tmp = new ListNode(0);
		 ListNode newHead = null;
		 
		 while(head != null ){
			 tmp = head.next;
			 head.next = newHead;
			 newHead = head;
			 head = tmp;
		 }
		 return newHead;
	}

}
