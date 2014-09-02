package nyu.tlj.leetcode.solution;


import nyu.tlj.leetcode.common.ListNode;

public class RemoveDuplicatesfromSortedListII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode deleteDuplicates(ListNode head) {
    	if(head == null || head.next == null){
    		return head;
    	}
    	
    	ListNode dummy = new ListNode(Integer.MIN_VALUE);
    	dummy.next = head;
    	head = dummy;
    	while(head.next != null && head.next.next != null){
    		
    		if(head.next.val == head.next.val){
    			
    			while(head.next != null && head.next.next != null && head.next.val == head.next.val){
    				head.next = head.next.next;
    			}
    			
    		}else{
    			head = head.next;
    		}
    		
    		
    	}
    
    	
    	return head.next;
        
    }

}
