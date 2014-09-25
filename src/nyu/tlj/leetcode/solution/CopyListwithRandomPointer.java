package nyu.tlj.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

import nyu.tlj.leetcode.common.RandomListNode;

public class CopyListwithRandomPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null) {
			return head;
		}
		Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

		RandomListNode dummy = new RandomListNode(0);
		RandomListNode pre = new RandomListNode(0);
		//pre.next = head;
		dummy = pre;
		while (head != null) {
			RandomListNode newnode = null;
			if ( map.containsKey(head) ) {
				newnode = map.get(head);
			} else {
				newnode = new RandomListNode(head.label);
				newnode.next = null;
				map.put(head, newnode);
				
				
				
			}
			
			

			if(head.random != null){
				//RandomListNode newrandom = null;//new RandomListNode(head.random.label);
				if( map.containsKey(head.random)){
					newnode.random = map.get(head.random);
				}else{
					newnode.random = new RandomListNode(head.random.label);
					map.put(head.random, newnode.random);
				}
				
			}
			
			pre.next = newnode;
			head = head.next;
			
			pre = newnode;
		}

		return dummy.next;

	}
}
