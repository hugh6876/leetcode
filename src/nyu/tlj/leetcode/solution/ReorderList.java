package nyu.tlj.leetcode.solution;

import nyu.tlj.leetcode.common.ListNode;

public class ReorderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);
		ListNode node8 = new ListNode(8);
		node1.next= node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		
		ReorderList reList = new ReorderList();
		reList.reorderList(node1);

	}

	public void reorderList(ListNode head) {
		if(head == null || head.next == null){
			return ;
		}
		
		ListNode mid = findMid(head);
		ListNode reversedHead = reverse(mid.next);
		mid.next = null;
	
		Merge(head,reversedHead);
		

	}
	private void Merge(ListNode head,ListNode reversedHead){
		ListNode dummy = new ListNode(0);
		ListNode tmpA = new ListNode(0);
		ListNode tmpB = new ListNode(0);
		dummy.next = head;
		while(head != null && reversedHead != null){
			tmpA = head.next;
			head.next = reversedHead;
			tmpB = reversedHead.next;
			reversedHead.next = tmpA;
			head = tmpA;
			reversedHead = tmpB;
			
			
		}
	}
	
	/**	 better merge function
	private void merge(ListNode head1, ListNode head2) {
        int index = 0;
        ListNode dummy = new ListNode(0);
        while (head1 != null && head2 != null) {
            if (index % 2 == 0) {
                dummy.next = head1;
                head1 = head1.next;
            } else {
                dummy.next = head2;
                head2 = head2.next;
            }
            dummy = dummy.next;
            index ++;
        }
        if (head1 != null) {
            dummy.next = head1;
        } else {
            dummy.next = head2;
        }
    }
	*/
	private ListNode findMid(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		
		ListNode slow = head, fast = head.next;
		
		while( fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			
		}
		
		return slow;
	}
	//reverse linked list
	private ListNode reverse(ListNode head){
		ListNode pre = null, cur = head;
		ListNode tmp = new ListNode(0);
		
		if(head == null || head.next == null){
			return head;
		}
		
		while(cur != null){

			tmp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = tmp;
		}
		return pre;
	}

}
