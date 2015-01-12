package nyu.tlj.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LRUCache la = new LRUCache(1);
	//set(2,1),get(2),set(3,2),get(2),get(3)
		la.set(2, 1);
		la.get(2);
		la.set(3, 2);
		la.get(2);
		la.get(3);

	}
	
	
	private class DNode{
		DNode pre;
		DNode next;
		public int key;
		public int value;
		public DNode(int k, int v){
			this.key = k;
			this.value = v;
			this.pre = null;
			this.next = null;
		}
	}
	
	Map<Integer, DNode> map;
	int capacity = 0,val;
	DNode head = new DNode(-1, -1);
	DNode tail = new DNode(-1, -1);
	DNode current = null;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.head = new DNode(-1, -1);
		this.tail = new DNode(-1, -1);
		head.next = tail;
		tail.pre = head;
		this.map =   new HashMap<Integer, DNode>();

	}

	public int get(int key) {
		if( map.containsKey(key) == false ) {
			return -1;
		}
		DNode del = map.get(key);
		remove(del);
		
//		del.pre.next = del.next;
//		del.next.pre = del.pre;
		
		
		moveToTail(del);
		return del.value;

	}



	public void set(int key, int value) {
		if( get(key) != -1){
			map.get(key).value = value;
			return;
		}
		
		if( this.capacity == map.size() ) {
			map.remove(head.next.key);
			removeHead();	
//			 head.next = head.next.next;
//	            head.next.pre = head;
	            
			
			
		}
		DNode node = new DNode(key, value);
	    map.put(key, node);
		
		moveToTail(node);
		

	}
	private void removeHead() {
		
		DNode d = head.next;
		head.next = d.next;
		head.next.pre = head;
																		
	}

	private void remove(DNode node) {
		node.pre.next = node.next;
		node.next.pre = node.pre;
		
	
		
	}
	public void moveToTail(DNode node){
    	node.next  =  tail;
    	node.pre = tail.pre;
    	tail.pre = node;
    	node.pre.next = node;
		
//		node.pre = tail.pre;
//	        tail.pre = node;
//	        node.pre.next = node;
//	        node.next = tail;
	}

}
