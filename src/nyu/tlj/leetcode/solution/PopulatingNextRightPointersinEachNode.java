package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;

public class PopulatingNextRightPointersinEachNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	//no recursive
	public void connect(TreeLinkNode root) {
		if (root == null)
			return;
		
		root.next = null;
		TreeLinkNode preNode = null;
		
		TreeLinkNode nextNode = null;
		
		while(root.left != null){
			
			preNode = root;
			
			do {
				nextNode = preNode.next;
				preNode.left.next = preNode.right;
				
				if(nextNode == null){
					preNode.right.next = null;
					
				}else {
					preNode.right.next = nextNode.left;
				}
				
				preNode = preNode.next;
			}while(preNode != null);
				
			root = root.left;
		}
		
	}
	//recursive
	public void connectRecursive(TreeLinkNode root) {
		
		if (root == null)
			return;
		if(root.left != null){
			root.left.next = root.right;
			
				
    		if(root.next != null){
    		  
    			root.right.next = root.next.left;
    		}else {
    		  
    			root.right.next = null;
    		}
		}
		connectRecursive(root.left);
		connectRecursive(root.right);
		
	}

}
