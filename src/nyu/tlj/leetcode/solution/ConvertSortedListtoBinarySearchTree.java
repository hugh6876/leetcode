package nyu.tlj.leetcode.solution;


import nyu.tlj.leetcode.common.ListNode;

public class ConvertSortedListtoBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode sortedListToBST(ListNode head) {
		if( head == null){
			return null;
		}
		int[] array = null;
		array = getArrayFromList(head);
		
		return sortedListToBST(array,0,array.length-1);
	}
	
	private TreeNode sortedListToBST(int[] num,int start,int end) {
		TreeNode node = new TreeNode(0);
		if( start > end ){
			return null;
		}
		int mid = (start + end)/2;
		node.val = num[mid];
		
		node.left = sortedListToBST(num,start,mid-1);
		node.right = sortedListToBST(num,mid+1,end);
		
		return node;
		
	}
	
	
	private int[] getArrayFromList(ListNode head) {
		ListNode tmpHead = head;
		int len = 0;
		while(tmpHead != null){
			len++;
			tmpHead = tmpHead.next;
			
		}
		int[] array = new int[len];
		
		tmpHead = head;
		len = 0;
		while(tmpHead != null){
			array[len++] = tmpHead.val;
			tmpHead = tmpHead.next;
			
		}
		
		return  array;
	}

}
