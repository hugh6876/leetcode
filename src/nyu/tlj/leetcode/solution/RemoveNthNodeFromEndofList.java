package nyu.tlj.leetcode.solution;

import nyu.tlj.leetcode.common.ListNode;

public class RemoveNthNodeFromEndofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//important
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	if(head == null){
    		return head;
    	}
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	
    	for(int i=1; i < n; i++){
    		if(head == null ){
    			return head;
    		}
    		
    		head = head.next;
    		
    	}
    	ListNode pre = dummy;
    	
    	while(head.next != null){
    		head = head.next;
    		
    		pre = pre.next;
    	}
    	pre.next = pre.next.next;
    	
    	return dummy.next;
    }
	

}
