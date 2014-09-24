package nyu.tlj.leetcode.solution;

public class ConvertSortedArraytoBinarySearchTree {

	private TreeNode node;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode sortedArrayToBST(int[] num) {
		TreeNode root = null;
		
		
		
		root = sortedArrayToBST(num,0,num.length-1);
		
		
		return root;
	}
	
	public TreeNode sortedArrayToBST(int[] num,int start,int end) {
		
		if(start>end){
			return null;
		}
		
		TreeNode node = new TreeNode(0);
		int mid = (start+end)/2;
		node.val = num[mid];
		
		node.left = sortedArrayToBST(num,start,mid-1);
		
		node.right =  sortedArrayToBST(num,mid+1,end);
		
		
		
		return node;
	}

}
