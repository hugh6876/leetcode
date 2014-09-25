package nyu.tlj.leetcode.solution;

import java.awt.HeadlessException;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import nyu.tlj.leetcode.common.ListNode;

public class MergekSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private class NodeComparator implements Comparator<ListNode>{

		@Override
		public int compare(ListNode o1, ListNode o2) {
			if(o1 == null){
				return 1;
			}else if( o2 == null){
				return -1;
			}
			
			return o1.val - o2.val;
		}
		
	}
	public ListNode mergeKLists(List<ListNode> lists) {
		ListNode dummy = new ListNode(0);
		ListNode cur = new ListNode(0);
		
		if(lists == null || lists.size() == 0){
			return null;
		}
		
		Queue<ListNode> heap = new PriorityQueue<ListNode>(lists.size(),new NodeComparator());
		
		for (int i = 0; i < lists.size(); i++) {
			cur = lists.get(i);
			if(cur != null){
				heap.add(cur);
			}
		}
		cur = dummy;
		dummy = cur;
		while(  !heap.isEmpty() ){
			cur.next = heap.poll();
			cur = cur.next;
			if(cur.next != null){
				heap.add(cur.next);
			}
			
		}
		
		
		
		return dummy.next;
	}

}
